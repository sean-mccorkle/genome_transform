/*
A KBase module: genome_transform
This sample module contains one small method - filter_contigs.
*/

#include <KBaseCommon.spec>

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
		Type to a file containing a data file for upload on the local filesystem
	*/
	typedef string file_type;

	/*
		Name of an object in the KBase workspace
	*/
	typedef string object_id;

	/*
		Name of an report id
	*/
	typedef string report_id;

	/*
	    status of the reads pair point outward or not
	*/
	typedef string outward;


	/*
		Name of a KBase workspace
	*/
	typedef string workspace_id;


	/*
		Name of a KBase reads type
	*/
	typedef string reads_type;

	/*
		Name of a KBase reads_id
	*/
	typedef string reads_id;

	/*
		Name of a KBase file_path_list
	*/
	typedef string file_path_list;

    /*
		Name of a KBase handle ref
	*/
	typedef string handle_ref;

    /*
		Name of a standard deviation
	*/
	typedef float std_dev;

    /*
		Name of a insert size
	*/
	typedef float insert_size;

	/*
		sequence type
	*/
	typedef int sra;

	/*
		Rna Seq metadata

	*/
	typedef   string domain;
    typedef   string platform;
    typedef   string sample_id;
    typedef   string condition;
    typedef   string source;
    typedef   string Library_type;
    typedef   string publication_Id;
    typedef   string external_source_date;
    typedef	  string sampleset_id;
    typedef   string sampleset_desc;




	/*
        Input parameters for the "genbank_to_genome" function.

		shock_ref genbank_shock_ref - optional URL to genbank file stored in Shock
		file_path genbank_file_path - optional path to genbank file on local file system
		workspace_id workspace - workspace where object will be saved
		object_id genome_id - workspace ID to which the genome object should be saved
		object_id contigset_id - workspace ID to which the contigs should be saved

	*/


	typedef structure {
		shock_ref genbank_shock_ref;
		file_path genbank_file_path;

		workspace_id workspace;
		object_id genome_id;
		object_id contigset_id;
   } genbank_to_genome_params;

   funcdef genbank_to_genome(genbank_to_genome_params) returns (object_id) authentication required;

   /*
        Input parameters for the "fasta_to_contig" function.

		shock_ref shock_ref - optional URL to fasta file stored in Shock
		file_path file_path - optional path to fasta file on local file system
		workspace_id workspace - workspace where object will be saved
		object_id genome_id - workspace ID to which the contigs object should be saved
		object_id contigset_id - workspace ID to which the contigs should be saved

	*/
	typedef structure {
		shock_ref fasta_shock_ref;
		file_path fasta_file_path;

		workspace_id workspace;
		object_id genome_id;
		object_id contigset_id;
   } fasta_to_contig_params;

   funcdef fasta_to_contig(fasta_to_contig_params) returns (object_id) authentication required;

   /*
        Input parameters for the "exp tsv to exp matirx" function.

		shock_ref shock_ref - optional URL to genbank file stored in Shock
		file_path file_path - optional path to genbank file on local file system
		workspace_id workspace - workspace where object will be saved
		object_id genome_id - workspace ID to which the genome object should be saved
		object_id contigset_id - workspace ID to which the contigs should be saved
   */

	typedef structure {
		shock_ref tsvexp_shock_ref;
		file_path tsvexp_file_path;

		workspace_id workspace;
		object_id genome_id;
		object_id expMaxId;
   }tsv_to_exp_params;

   funcdef tsv_to_exp(tsv_to_exp_params) returns (object_id) authentication required;



   /*
        Input parameters for the "reads to assembly" function.

        shock_ref shock_ref - optional URL to genbank file stored in Shock
        file_path file_path - optional path to genbank file on local file system
        workspace_id workspace - workspace where object will be saved
        object_id reads_id - workspace ID to which the genome object should be saved
        object_id contigset_id - workspace ID to which the contigs should be saved
   */


   typedef structure{

       string domain;
       string platform;
       string sample_id;
       string condition;
       string source;
       string Library_type;
       string publication_Id;
       string external_source_date;

   }rnaSeqMeta;

   typedef structure {
		shock_ref reads_shock_ref;
        handle_ref reads_handle_ref;
        string reads_type;
        list <string> file_path_list;
        mapping <string, rnaSeqMeta> rnaSeqMetaData;
        workspace_id workspace;
        object_id reads_id;
        string outward;
        float insert_size;
        float std_dev;

   }reads_to_assembly_params;


   typedef structure {
		shock_ref reads_shock_ref;
        handle_ref reads_handle_ref;
        string reads_type;
        list <string> file_path_list;
        mapping <string, rnaSeqMeta> rnaSeqMetaData;
        workspace_id workspace;
        object_id reads_id;
        string outward;
        float insert_size;
        float std_dev;
        int sra;
   }rnaseq_sequence_params;

   typedef structure {
   		workspace_id workspace;
   		string domain;
   		string sampleset_id;
       	string sampleset_desc;
   		list <rnaseq_sequence_params> rnaSeqSample;
   }rna_sample_set_params;

   funcdef reads_to_assembly(reads_to_assembly_params) returns (object_id) authentication required;

   funcdef sra_reads_to_assembly(reads_to_assembly_params) returns (object_id) authentication required;

   funcdef rna_sample_set(rna_sample_set_params) returns (object_id) authentication required;


   /* these next methods use the new ReadsUtils module methods for uploading */

   typedef structure {

        list <string> file_path_list;   /* input filename(s).  One (single end or SRA paired end) or two files (for paired end)
           
        string        reads_type;       /* either PairedEndLibrary or SingleEndLibrary */

        /* mapping <string, rnaSeqMeta> rnaSeqMetaData; */

        /* one of the next two is required, in order to identify the target workspace for */
        /* storing the resultant object                                                   */

        string        workspace_name;
        int           workspace_id;

        /* one of the next two parameters is required to specify the object where the library */
        /* will be stored.  Many of these are drawn from UploadReadsParams from ReadsUtils */

        string        object_name;      /* for new object, or replacing existing object */
        int           object_id;        /* can be used if replacing an existing object */

        /* this must be set if the input is a paired end library with reads in a single file */
        int           is_interleaved;       /* 1 if paired ends are in a single fastq file (default 0) */

        /* remaining parameters are optional, metadata for the resultant workspace object */
        float         insert_size;
        float         std_dev;              /* std of insert sizes */
        int           orientation_outward;  /* 0 if inward pointing reads (defaul), 1 if outward */

        string        sequencing_tech;
        int           single_genome;        /* 1 if single genome, 0 if metagenome*/

        KBaseCommon.StrainInfo   strain;    /* unable to find the KBaseCommon.spec file */
        KBaseCommon.SourceInfo   source;

   } reads_to_library_params;

   funcdef reads_to_library( reads_to_library_params ) returns ( object_id ) authentication required;

   funcdef sra_reads_to_library( reads_to_library_params ) returns ( object_id ) authentication required;

};
