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

print "begin reads_utils_tests.pl\n"; 

my @reads_params = (
   {
    file_path_list => [ '/kb/module/data/short_1.fastq', '/kb/module/data/short_2.fastq' ],
    reads_type => 'PairedEndLibrary',

    workspace_name  => $target_workspace_name,
    object_name => 'ru_fq_1_pe_library',

    sequencing_tech => 'Illumina',
   },

);

print "begin reads_to_libary test\n";

foreach my $input_parms ( @reads_params )
   {
    #eval {
          my $ret = $impl->reads_to_library( $input_parms );
    #    };
   }

print "end reads_to_library test\n";


my @comp_fastqs = (
   {
    reads_shock_ref => 'https://ci.kbase.us/services/shock-api/',
    reads_handle_ref => 'https://ci.kbase.us/services/handle_servce',
    reads_type => 'PairedEndLibrary',
    file_path_list => [ '/kb/module/data/short_1.fastq', '/kb/module/data/short_2.fastq' ],
    workspace => $target_workspace,
    reads_id => 'comp_fq_1_reads',
   },
   {
    reads_shock_ref => 'https://ci.kbase.us/services/shock-api/',
    reads_handle_ref => 'https://ci.kbase.us/services/handle_servce',
    reads_type => 'PairedEndLibrary',
    file_path_list => [ '/kb/module/data/short_1.fastq.gz', '/kb/module/data/short_2.fastq.gz' ],
    workspace => $target_workspace,
    reads_id => 'comp_fq_2_reads',
   },
   {
    reads_shock_ref => 'https://ci.kbase.us/services/shock-api/',
    reads_handle_ref => 'https://ci.kbase.us/services/handle_servce',
    reads_type => 'PairedEndLibrary',
    file_path_list => [ '/kb/module/data/short_1.fastq.gzip', '/kb/module/data/short_2.fastq.gzip' ],
    workspace => $target_workspace,
    reads_id => 'comp_fq_3_reads',
   },
   {
    reads_shock_ref => 'https://ci.kbase.us/services/shock-api/',
    reads_handle_ref => 'https://ci.kbase.us/services/handle_servce',
    reads_type => 'PairedEndLibrary',
    file_path_list => [ '/kb/module/data/short_1.fastq.bz2', '/kb/module/data/short_2.fastq.bz2' ],
    workspace => $target_workspace,
    reads_id => 'comp_fq_4_reads',
   },
   {
    reads_shock_ref => 'https://ci.kbase.us/services/shock-api/',
    reads_handle_ref => 'https://ci.kbase.us/services/handle_servce',
    reads_type => 'PairedEndLibrary',
    file_path_list => [ '/kb/module/data/short_1.fastq.bzip2', '/kb/module/data/short_2.fastq.bzip2' ],
    workspace => $target_workspace,
    reads_id => 'comp_fq_5_reads',
   },
   # this should fail
   {
    reads_shock_ref => 'https://ci.kbase.us/services/shock-api/',
    reads_handle_ref => 'https://ci.kbase.us/services/handle_servce',
    reads_type => 'SingleEndLibrary',
    file_path_list => [ '/kb/module/data/shorts.tar.gz' ],
    workspace => $target_workspace,
    reads_id => 'comp_fq_1_reads',
   },
   # and this
   {
    reads_shock_ref => 'https://ci.kbase.us/services/shock-api/',
    reads_handle_ref => 'https://ci.kbase.us/services/handle_servce',
    reads_type => 'SingleEndLibrary',
    file_path_list => [ '/kb/module/data/shorts.zip' ],
    workspace => $target_workspace,
    reads_id => 'comp_fq_1_reads',
   },

);


#rint "begin reads_to_assembly test\n";
#oreach my $input_parms ( @comp_fastqs )
#  {
#   #eval {
#         { my $ret = $impl->reads_to_assembly( $input_parms );
#           print "returns\n"; 
#           print Dumper( $ret ); 
#         }
#   #     };
#  }
#rint "end reads_to_assembly test\n";


my @comp_sras = (
   {
    reads_shock_ref => 'https://ci.kbase.us/services/shock-api/',
    reads_handle_ref => 'https://ci.kbase.us/services/handle_servce',
    reads_type => 'PairedEndLibrary',
    file_path_list => [ '/kb/module/data/SRR3944606.sra.gz' ],
    workspace => $target_workspace,
    reads_id =>     'new_comp_sra_reads1',
   },
   {
    reads_shock_ref => 'https://ci.kbase.us/services/shock-api/',
    reads_handle_ref => 'https://ci.kbase.us/services/handle_servce',
    reads_type => 'PairedEndLibrary',
    file_path_list => [ '/kb/module/data/SRR3944606.sra' ],
    workspace => $target_workspace,
    reads_id =>     'new_comp_sra_reads2',
   }
);

#print "begin sra_reads_to_assembly test\n";
#
#foreach my $input_parms ( @comp_sras )
#   {
#    eval {
#          { my $ret = $impl->sra_reads_to_assembly( $input_parms );
#            print "returns\n"; 
#            print Dumper( $ret ); 
#          }
#         };
#   }
#print "end sra_reads_to_assembly test\n";

print "end compressed_reads_test.pl\n"; 

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
