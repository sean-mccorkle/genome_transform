
package us.kbase.genometransform;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: fasta_to_contig_params</p>
 * <pre>
 * Input parameters for the "fasta_to_contig" function.
 *         shock_ref shock_ref - optional URL to fasta file stored in Shock
 *         file_path file_path - optional path to fasta file on local file system
 *         workspace_id workspace - workspace where object will be saved
 *         object_id genome_id - workspace ID to which the contigs object should be saved
 *         object_id contigset_id - workspace ID to which the contigs should be saved
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "fasta_shock_ref",
    "fasta_file_path",
    "workspace",
    "genome_id",
    "contigset_id"
})
public class FastaToContigParams {

    @JsonProperty("fasta_shock_ref")
    private String fastaShockRef;
    @JsonProperty("fasta_file_path")
    private String fastaFilePath;
    @JsonProperty("workspace")
    private String workspace;
    @JsonProperty("genome_id")
    private String genomeId;
    @JsonProperty("contigset_id")
    private String contigsetId;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fasta_shock_ref")
    public String getFastaShockRef() {
        return fastaShockRef;
    }

    @JsonProperty("fasta_shock_ref")
    public void setFastaShockRef(String fastaShockRef) {
        this.fastaShockRef = fastaShockRef;
    }

    public FastaToContigParams withFastaShockRef(String fastaShockRef) {
        this.fastaShockRef = fastaShockRef;
        return this;
    }

    @JsonProperty("fasta_file_path")
    public String getFastaFilePath() {
        return fastaFilePath;
    }

    @JsonProperty("fasta_file_path")
    public void setFastaFilePath(String fastaFilePath) {
        this.fastaFilePath = fastaFilePath;
    }

    public FastaToContigParams withFastaFilePath(String fastaFilePath) {
        this.fastaFilePath = fastaFilePath;
        return this;
    }

    @JsonProperty("workspace")
    public String getWorkspace() {
        return workspace;
    }

    @JsonProperty("workspace")
    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public FastaToContigParams withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    @JsonProperty("genome_id")
    public String getGenomeId() {
        return genomeId;
    }

    @JsonProperty("genome_id")
    public void setGenomeId(String genomeId) {
        this.genomeId = genomeId;
    }

    public FastaToContigParams withGenomeId(String genomeId) {
        this.genomeId = genomeId;
        return this;
    }

    @JsonProperty("contigset_id")
    public String getContigsetId() {
        return contigsetId;
    }

    @JsonProperty("contigset_id")
    public void setContigsetId(String contigsetId) {
        this.contigsetId = contigsetId;
    }

    public FastaToContigParams withContigsetId(String contigsetId) {
        this.contigsetId = contigsetId;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((((((((((("FastaToContigParams"+" [fastaShockRef=")+ fastaShockRef)+", fastaFilePath=")+ fastaFilePath)+", workspace=")+ workspace)+", genomeId=")+ genomeId)+", contigsetId=")+ contigsetId)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
