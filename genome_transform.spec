/*
A KBase module: genome_transform
This sample module contains one small method - filter_contigs.
*/

module genome_transform {
/*
       A string representing the flie path
   */
   typedef string file_path;
   /*
       String represent the file_type
   */
   typedef string file_type;
   
   typedef structure {
       string file_path;
       string file_type;
   } GenomeObject;
   
   funcdef genome_transform_script(file_path, file_type) returns (GenomeObject) authentication required;
};
