
package us.kbase.genometransform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: rna_sample_set_params</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "workspace",
    "domain",
    "sampleset_id",
    "sampleset_desc",
    "rnaSeqSample"
})
public class RnaSampleSetParams {

    @JsonProperty("workspace")
    private String workspace;
    @JsonProperty("domain")
    private String domain;
    @JsonProperty("sampleset_id")
    private String samplesetId;
    @JsonProperty("sampleset_desc")
    private String samplesetDesc;
    @JsonProperty("rnaSeqSample")
    private List<RnaseqSequenceParams> rnaSeqSample;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("workspace")
    public String getWorkspace() {
        return workspace;
    }

    @JsonProperty("workspace")
    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public RnaSampleSetParams withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    @JsonProperty("domain")
    public String getDomain() {
        return domain;
    }

    @JsonProperty("domain")
    public void setDomain(String domain) {
        this.domain = domain;
    }

    public RnaSampleSetParams withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    @JsonProperty("sampleset_id")
    public String getSamplesetId() {
        return samplesetId;
    }

    @JsonProperty("sampleset_id")
    public void setSamplesetId(String samplesetId) {
        this.samplesetId = samplesetId;
    }

    public RnaSampleSetParams withSamplesetId(String samplesetId) {
        this.samplesetId = samplesetId;
        return this;
    }

    @JsonProperty("sampleset_desc")
    public String getSamplesetDesc() {
        return samplesetDesc;
    }

    @JsonProperty("sampleset_desc")
    public void setSamplesetDesc(String samplesetDesc) {
        this.samplesetDesc = samplesetDesc;
    }

    public RnaSampleSetParams withSamplesetDesc(String samplesetDesc) {
        this.samplesetDesc = samplesetDesc;
        return this;
    }

    @JsonProperty("rnaSeqSample")
    public List<RnaseqSequenceParams> getRnaSeqSample() {
        return rnaSeqSample;
    }

    @JsonProperty("rnaSeqSample")
    public void setRnaSeqSample(List<RnaseqSequenceParams> rnaSeqSample) {
        this.rnaSeqSample = rnaSeqSample;
    }

    public RnaSampleSetParams withRnaSeqSample(List<RnaseqSequenceParams> rnaSeqSample) {
        this.rnaSeqSample = rnaSeqSample;
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
        return ((((((((((((("RnaSampleSetParams"+" [workspace=")+ workspace)+", domain=")+ domain)+", samplesetId=")+ samplesetId)+", samplesetDesc=")+ samplesetDesc)+", rnaSeqSample=")+ rnaSeqSample)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
