use genome_transform::genome_transformImpl;

use genome_transform::genome_transformServer;
use Plack::Middleware::CrossOrigin;



my @dispatch;

{
    my $obj = genome_transform::genome_transformImpl->new;
    push(@dispatch, 'genome_transform' => $obj);
}


my $server = genome_transform::genome_transformServer->new(instance_dispatch => { @dispatch },
				allow_get => 0,
			       );

my $handler = sub { $server->handle_input(@_) };

$handler = Plack::Middleware::CrossOrigin->wrap( $handler, origins => "*", headers => "*");
