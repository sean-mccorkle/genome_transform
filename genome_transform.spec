/*
A KBase module: genome_transform
This sample module contains one small method - filter_contigs.
*/

module genome_transform {
/*
		URL to a shock node containing a data file for upload
	*/
	typedef string shock_ref;
	/*
		Path to a file containing a data file for upload on the local filesystem
	*/
	typedef string file_path;
	/*
		Name of an object in the KBase workspace
	*/
	typedef string object_id;
	/*
		Name of a KBase workspace
	*/
	typedef string workspace_id;
	
	/* Input parameters for the "genbank_to_genome" function.
	
		shock_ref genbank_shock_ref - optional URL to genbank file stored in Shock
		file_path genbank_file_path - optional path to genbank file on local file system
		workspace_id workspace - workspace where object will be saved
		object_id genome_id - workspace ID to which the genome object should be saved 
		object_id contigset_id - workspace ID to which the contigs should be saved
			
	*/
	typedef structure {
		shock_ref genbank_shock_ref;
		file_path genbank_file_path;
		
		workspace_id workspace	
		object_id genome_id;
		object_id contigset_id;
   } genbank_to_genome_params;
   
   funcdef genbank_to_genome(genbank_to_genome_params) returns (object_id report_id) authentication required;
   
   /* Input parameters for the "genbank_to_genome" function.
	
		shock_ref shock_ref - optional URL to genbank file stored in Shock
		file_path file_path - optional path to genbank file on local file system
		workspace_id workspace - workspace where object will be saved
		object_id genome_id - workspace ID to which the genome object should be saved 
		object_id contigset_id - workspace ID to which the contigs should be saved
			
	*/
	typedef structure {
		shock_ref fasta_shock_ref;
		shock_ref gff_shock_ref;
		file_path gff_file_path;
		file_path fasta_file_path;
		
		workspace_id workspace;	
		object_id genome_id;
		object_id contigset_id;
   } gff_to_genome;
   
   funcdef genome_transform_script(file_path, file_type) returns (GenomeObject) authentication required;
};
