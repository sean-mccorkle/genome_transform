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

my $input;

$input = {
    genbank_file_path => '/data/bulktest/data/bulktest/janakakbase/NC_003197.gbk',
    genbank_shock_ref => 'https://ci.kbase.us/services/shock-api',
    workspace => 'janakakbase:1464032798535',
    genome_id => 'NC_003197',
    contigset_id => 'NC_003197Contig'
};

my $input_fasta;

$input_fasta = {
    fasta_file_path => '/kb/module/data/',
    fasta_shock_ref => 'https://ci.kbase.us/services/shock-api',
    workspace => 'janakakbase:1464032798535',
    genome_id => 'fasciculatum',
    contigset_id => 'fasciculatum_ContigSet'
};

my $input_exp;

$input_exp = {
    tsvexp_file_path => '/kb/module/data/',
    tsvexp_shock_ref => 'https://ci.kbase.us/services/shock-api',
    workspace => 'janakakbase:1464032798535',
    genome_id => 'acetobacterium',
    expMaxId => 'AcetoExpMatrix'
};

#$input =[$sR,$fp,$ws, $gId, $conId];
eval {
my $ret =$impl->tsv_to_exp($input_exp);

};


eval {
#my $ret =$impl->fasta_to_contig($input_fasta);

};


eval {
    #my $ret =$impl->genbank_to_genome($input);
};


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
