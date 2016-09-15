
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
 * <p>Original spec-file type: rnaseq_sequence_params</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "reads_shock_ref",
    "reads_handle_ref",
    "reads_type",
    "file_path_list",
    "rnaSeqMetaData",
    "workspace",
    "reads_id",
    "outward",
    "insert_size",
    "std_dev",
    "sra"
})
public class RnaseqSequenceParams {

    @JsonProperty("reads_shock_ref")
    private java.lang.String readsShockRef;
    @JsonProperty("reads_handle_ref")
    private java.lang.String readsHandleRef;
    @JsonProperty("reads_type")
    private java.lang.String readsType;
    @JsonProperty("file_path_list")
    private List<String> filePathList;
    @JsonProperty("rnaSeqMetaData")
    private Map<String, RnaSeqMeta> rnaSeqMetaData;
    @JsonProperty("workspace")
    private java.lang.String workspace;
    @JsonProperty("reads_id")
    private java.lang.String readsId;
    @JsonProperty("outward")
    private java.lang.String outward;
    @JsonProperty("insert_size")
    private Double insertSize;
    @JsonProperty("std_dev")
    private Double stdDev;
    @JsonProperty("sra")
    private Long sra;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("reads_shock_ref")
    public java.lang.String getReadsShockRef() {
        return readsShockRef;
    }

    @JsonProperty("reads_shock_ref")
    public void setReadsShockRef(java.lang.String readsShockRef) {
        this.readsShockRef = readsShockRef;
    }

    public RnaseqSequenceParams withReadsShockRef(java.lang.String readsShockRef) {
        this.readsShockRef = readsShockRef;
        return this;
    }

    @JsonProperty("reads_handle_ref")
    public java.lang.String getReadsHandleRef() {
        return readsHandleRef;
    }

    @JsonProperty("reads_handle_ref")
    public void setReadsHandleRef(java.lang.String readsHandleRef) {
        this.readsHandleRef = readsHandleRef;
    }

    public RnaseqSequenceParams withReadsHandleRef(java.lang.String readsHandleRef) {
        this.readsHandleRef = readsHandleRef;
        return this;
    }

    @JsonProperty("reads_type")
    public java.lang.String getReadsType() {
        return readsType;
    }

    @JsonProperty("reads_type")
    public void setReadsType(java.lang.String readsType) {
        this.readsType = readsType;
    }

    public RnaseqSequenceParams withReadsType(java.lang.String readsType) {
        this.readsType = readsType;
        return this;
    }

    @JsonProperty("file_path_list")
    public List<String> getFilePathList() {
        return filePathList;
    }

    @JsonProperty("file_path_list")
    public void setFilePathList(List<String> filePathList) {
        this.filePathList = filePathList;
    }

    public RnaseqSequenceParams withFilePathList(List<String> filePathList) {
        this.filePathList = filePathList;
        return this;
    }

    @JsonProperty("rnaSeqMetaData")
    public Map<String, RnaSeqMeta> getRnaSeqMetaData() {
        return rnaSeqMetaData;
    }

    @JsonProperty("rnaSeqMetaData")
    public void setRnaSeqMetaData(Map<String, RnaSeqMeta> rnaSeqMetaData) {
        this.rnaSeqMetaData = rnaSeqMetaData;
    }

    public RnaseqSequenceParams withRnaSeqMetaData(Map<String, RnaSeqMeta> rnaSeqMetaData) {
        this.rnaSeqMetaData = rnaSeqMetaData;
        return this;
    }

    @JsonProperty("workspace")
    public java.lang.String getWorkspace() {
        return workspace;
    }

    @JsonProperty("workspace")
    public void setWorkspace(java.lang.String workspace) {
        this.workspace = workspace;
    }

    public RnaseqSequenceParams withWorkspace(java.lang.String workspace) {
        this.workspace = workspace;
        return this;
    }

    @JsonProperty("reads_id")
    public java.lang.String getReadsId() {
        return readsId;
    }

    @JsonProperty("reads_id")
    public void setReadsId(java.lang.String readsId) {
        this.readsId = readsId;
    }

    public RnaseqSequenceParams withReadsId(java.lang.String readsId) {
        this.readsId = readsId;
        return this;
    }

    @JsonProperty("outward")
    public java.lang.String getOutward() {
        return outward;
    }

    @JsonProperty("outward")
    public void setOutward(java.lang.String outward) {
        this.outward = outward;
    }

    public RnaseqSequenceParams withOutward(java.lang.String outward) {
        this.outward = outward;
        return this;
    }

    @JsonProperty("insert_size")
    public Double getInsertSize() {
        return insertSize;
    }

    @JsonProperty("insert_size")
    public void setInsertSize(Double insertSize) {
        this.insertSize = insertSize;
    }

    public RnaseqSequenceParams withInsertSize(Double insertSize) {
        this.insertSize = insertSize;
        return this;
    }

    @JsonProperty("std_dev")
    public Double getStdDev() {
        return stdDev;
    }

    @JsonProperty("std_dev")
    public void setStdDev(Double stdDev) {
        this.stdDev = stdDev;
    }

    public RnaseqSequenceParams withStdDev(Double stdDev) {
        this.stdDev = stdDev;
        return this;
    }

    @JsonProperty("sra")
    public Long getSra() {
        return sra;
    }

    @JsonProperty("sra")
    public void setSra(Long sra) {
        this.sra = sra;
    }

    public RnaseqSequenceParams withSra(Long sra) {
        this.sra = sra;
        return this;
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public java.lang.String toString() {
        return ((((((((((((((((((((((((("RnaseqSequenceParams"+" [readsShockRef=")+ readsShockRef)+", readsHandleRef=")+ readsHandleRef)+", readsType=")+ readsType)+", filePathList=")+ filePathList)+", rnaSeqMetaData=")+ rnaSeqMetaData)+", workspace=")+ workspace)+", readsId=")+ readsId)+", outward=")+ outward)+", insertSize=")+ insertSize)+", stdDev=")+ stdDev)+", sra=")+ sra)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
