package genome_transform::genome_transformImpl;
use strict;
use Bio::KBase::Exceptions;
# Use Semantic Versioning (2.0.0-rc.1)
# http://semver.org 
our $VERSION = "0.1.0";

=head1 NAME

genome_transform

=head1 DESCRIPTION

A KBase module: genome_transform
This sample module contains one small method - filter_contigs.

=cut

#BEGIN_HEADER
use Bio::KBase::AuthToken;
use Bio::KBase::workspace::Client;
use Config::IniFiles;
use Data::Dumper;
#END_HEADER

sub new
{
    my($class, @args) = @_;
    my $self = {
    };
    bless $self, $class;
    #BEGIN_CONSTRUCTOR
    
    my $config_file = $ENV{ KB_DEPLOYMENT_CONFIG };
    my $cfg = Config::IniFiles->new(-file=>$config_file);
    my $wsInstance = $cfg->val('genome_transform','workspace-url');
    die "no workspace-url defined" unless $wsInstance;
    
    $self->{'workspace-url'} = $wsInstance;
    
    #END_CONSTRUCTOR

    if ($self->can('_init_instance'))
    {
	$self->_init_instance();
    }
    return $self;
}

=head1 METHODS



=head2 genome_transform_script

  $return = $obj->genome_transform_script($file_path, $file_type)

=over 4

=item Parameter and return types

=begin html

<pre>
$file_path is a genome_transform.file_path
$file_type is a genome_transform.file_type
$return is a genome_transform.GenomeObject
file_path is a string
file_type is a string
GenomeObject is a reference to a hash where the following keys are defined:
	file_path has a value which is a string
	file_type has a value which is a string

</pre>

=end html

=begin text

$file_path is a genome_transform.file_path
$file_type is a genome_transform.file_type
$return is a genome_transform.GenomeObject
file_path is a string
file_type is a string
GenomeObject is a reference to a hash where the following keys are defined:
	file_path has a value which is a string
	file_type has a value which is a string


=end text



=item Description



=back

=cut

sub genome_transform_script
{
    my $self = shift;
    my($file_path, $file_type) = @_;

    my @_bad_arguments;
    (!ref($file_path)) or push(@_bad_arguments, "Invalid type for argument \"file_path\" (value was \"$file_path\")");
    (!ref($file_type)) or push(@_bad_arguments, "Invalid type for argument \"file_type\" (value was \"$file_type\")");
    if (@_bad_arguments) {
	my $msg = "Invalid arguments passed to genome_transform_script:\n" . join("", map { "\t$_\n" } @_bad_arguments);
	Bio::KBase::Exceptions::ArgumentValidationError->throw(error => $msg,
							       method_name => 'genome_transform_script');
    }

    my $ctx = $genome_transform::genome_transformServer::CallContext;
    my($return);
    #BEGIN genome_transform_script

    #example GBK file
    $file_path = "../data/NC_003197.gbk";

    open(my $fh, $file_path) || die "Could not open gbk file: $!";
    while (my $input = <$fh>){
        chomp $input;
        print "$input\n";
    }

    print "file path  $file_path\n";

    die;
    #intermediary output files could be write to

    my $temp_0ut = "/kb/module/work/tmp/tempTF";




    #END genome_transform_script
    my @_bad_returns;
    (ref($return) eq 'HASH') or push(@_bad_returns, "Invalid type for return variable \"return\" (value was \"$return\")");
    if (@_bad_returns) {
	my $msg = "Invalid returns passed to genome_transform_script:\n" . join("", map { "\t$_\n" } @_bad_returns);
	Bio::KBase::Exceptions::ArgumentValidationError->throw(error => $msg,
							       method_name => 'genome_transform_script');
    }
    return($return);
}




=head2 version 

  $return = $obj->version()

=over 4

=item Parameter and return types

=begin html

<pre>
$return is a string
</pre>

=end html

=begin text

$return is a string

=end text

=item Description

Return the module version. This is a Semantic Versioning number.

=back

=cut

sub version {
    return $VERSION;
}

=head1 TYPES



=head2 file_path

=over 4



=item Description

A string representing the flie path


=item Definition

=begin html

<pre>
a string
</pre>

=end html

=begin text

a string

=end text

=back



=head2 file_type

=over 4



=item Description

String represent the file_type


=item Definition

=begin html

<pre>
a string
</pre>

=end html

=begin text

a string

=end text

=back



=head2 GenomeObject

=over 4



=item Definition

=begin html

<pre>
a reference to a hash where the following keys are defined:
file_path has a value which is a string
file_type has a value which is a string

</pre>

=end html

=begin text

a reference to a hash where the following keys are defined:
file_path has a value which is a string
file_type has a value which is a string


=end text

=back



=cut

1;
