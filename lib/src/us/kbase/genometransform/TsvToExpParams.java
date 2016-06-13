
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
 * <p>Original spec-file type: tsv_to_exp_params</p>
 * <pre>
 * Input parameters for the "exp tsv to exp matirx" function.
 *         shock_ref shock_ref - optional URL to genbank file stored in Shock
 *         file_path file_path - optional path to genbank file on local file system
 *         workspace_id workspace - workspace where object will be saved
 *         object_id genome_id - workspace ID to which the genome object should be saved
 *         object_id contigset_id - workspace ID to which the contigs should be saved
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "tsvexp_shock_ref",
    "tsvexp_file_path",
    "workspace",
    "expMaxId"
})
public class TsvToExpParams {

    @JsonProperty("tsvexp_shock_ref")
    private String tsvexpShockRef;
    @JsonProperty("tsvexp_file_path")
    private String tsvexpFilePath;
    @JsonProperty("workspace")
    private String workspace;
    @JsonProperty("expMaxId")
    private String expMaxId;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tsvexp_shock_ref")
    public String getTsvexpShockRef() {
        return tsvexpShockRef;
    }

    @JsonProperty("tsvexp_shock_ref")
    public void setTsvexpShockRef(String tsvexpShockRef) {
        this.tsvexpShockRef = tsvexpShockRef;
    }

    public TsvToExpParams withTsvexpShockRef(String tsvexpShockRef) {
        this.tsvexpShockRef = tsvexpShockRef;
        return this;
    }

    @JsonProperty("tsvexp_file_path")
    public String getTsvexpFilePath() {
        return tsvexpFilePath;
    }

    @JsonProperty("tsvexp_file_path")
    public void setTsvexpFilePath(String tsvexpFilePath) {
        this.tsvexpFilePath = tsvexpFilePath;
    }

    public TsvToExpParams withTsvexpFilePath(String tsvexpFilePath) {
        this.tsvexpFilePath = tsvexpFilePath;
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

    public TsvToExpParams withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    @JsonProperty("expMaxId")
    public String getExpMaxId() {
        return expMaxId;
    }

    @JsonProperty("expMaxId")
    public void setExpMaxId(String expMaxId) {
        this.expMaxId = expMaxId;
    }

    public TsvToExpParams withExpMaxId(String expMaxId) {
        this.expMaxId = expMaxId;
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
        return ((((((((((("TsvToExpParams"+" [tsvexpShockRef=")+ tsvexpShockRef)+", tsvexpFilePath=")+ tsvexpFilePath)+", workspace=")+ workspace)+", expMaxId=")+ expMaxId)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
