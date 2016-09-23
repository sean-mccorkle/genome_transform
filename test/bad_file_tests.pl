use strict;
use Data::Dumper;
use Test::More;
use Config::Simple;
use Time::HiRes qw(time);
use Bio::KBase::AuthToken;
use Bio::KBase::workspace::Client;
use genome_transform::genome_transformImpl;

local $| = 1;
my $token = $ENV{'KB_AUTH_TOKEN'};
my $config_file = $ENV{'KB_DEPLOYMENT_CONFIG'};
my $config = new Config::Simple($config_file)->get_block('genome_transform');
my $ws_url = $config->{"workspace-url"};
my $ws_name = undef;
my $ws_client = new Bio::KBase::workspace::Client($ws_url,token => $token);
my $auth_token = Bio::KBase::AuthToken->new(token => $token, ignore_authrc => 1);
my $ctx = LocalCallContext->new($token, $auth_token->user_id);
$genome_transform::genome_transformServer::CallContext = $ctx;
my $impl = new genome_transform::genome_transformImpl();

my $target_workspace = 'kb|ws.9196';
my $target_workspace_name = 'mccorkle:1469823748917';

print "begin bad_file_tests.pl\n"; 

my @reads_params = (
   {
    reads_shock_ref => 'https://ci.kbase.us/services/shock-api/',
    reads_handle_ref => 'https://ci.kbase.us/services/handle_servce',
    reads_type => 'SingleEndLibrary',
    file_path_list => [ '/kb/module/data/short_1.smorg' ],
    workspace => $target_workspace,
    reads_id => 'comp_fasta_1_reads',
   },
   {
    reads_shock_ref => 'https://ci.kbase.us/services/shock-api/',
    reads_handle_ref => 'https://ci.kbase.us/services/handle_servce',
    reads_type => 'PairedEndLibrary',
    file_path_list => [ '/kb/module/data/short_1.fasta', '/kb/module/data/short_2.smorg' ],
    workspace => $target_workspace,
    reads_id => 'comp_fasta_2_reads',
   },

);

print "begin reads_to_assembly test\n";

foreach my $input_parms ( @reads_params )
   {
    #eval {
          my $ret = $impl->reads_to_assembly( $input_parms );
          print "back:  ret is", Dumper( $ret ), "\n";
    #    };
   }

print "end reads_to_assembly test\n";
 
print "end bad_file_tests.pl\n"; 

my $err = undef;
if ($@) {
    $err = $@;
}
eval {
    if (defined($ws_name)) {
        $ws_client->delete_workspace({workspace => $ws_name});
        print("Test workspace was deleted\n");
    }
};
if (defined($err)) {
    if(ref($err) eq "Bio::KBase::Exceptions::KBaseException") {
        die("Error while running tests: " . $err->trace->as_string);
    } else {
        die $err;
    }
}

{
    package LocalCallContext;
    use strict;
    sub new {
        my($class,$token,$user) = @_;
        my $self = {
            token => $token,
            user_id => $user
        };
        return bless $self, $class;
    }
    sub user_id {
        my($self) = @_;
        return $self->{user_id};
    }
    sub token {
        my($self) = @_;
        return $self->{token};
    }
    sub provenance {
        my($self) = @_;
        return [{'service' => 'genome_transform', 'method' => 'please_never_use_it_in_production', 'method_params' => []}];
    }
    sub authenticated {
        return 1;
    }
    sub log_debug {
        my($self,$msg) = @_;
        print STDERR $msg."\n";
    }
    sub log_info {
        my($self,$msg) = @_;
        print STDERR $msg."\n";
    }
}
