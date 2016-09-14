
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
 * <p>Original spec-file type: reads_to_library_params</p>
 * <pre>
 * these next methods use the new ReadsUtils module methods for uploading
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "file_path_list",
    "workspace_name",
    "workspace_id",
    "object_name",
    "object_id",
    "is_interleaved",
    "insert_size",
    "std_dev",
    "orientation_outward",
    "sequencing_tech",
    "single_genome"
})
public class ReadsToLibraryParams {

    @JsonProperty("file_path_list")
    private List<String> filePathList;
    @JsonProperty("workspace_name")
    private java.lang.String workspaceName;
    @JsonProperty("workspace_id")
    private Long workspaceId;
    @JsonProperty("object_name")
    private java.lang.String objectName;
    @JsonProperty("object_id")
    private Long objectId;
    @JsonProperty("is_interleaved")
    private Long isInterleaved;
    @JsonProperty("insert_size")
    private Double insertSize;
    @JsonProperty("std_dev")
    private Double stdDev;
    @JsonProperty("orientation_outward")
    private Long orientationOutward;
    @JsonProperty("sequencing_tech")
    private java.lang.String sequencingTech;
    @JsonProperty("single_genome")
    private Long singleGenome;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("file_path_list")
    public List<String> getFilePathList() {
        return filePathList;
    }

    @JsonProperty("file_path_list")
    public void setFilePathList(List<String> filePathList) {
        this.filePathList = filePathList;
    }

    public ReadsToLibraryParams withFilePathList(List<String> filePathList) {
        this.filePathList = filePathList;
        return this;
    }

    @JsonProperty("workspace_name")
    public java.lang.String getWorkspaceName() {
        return workspaceName;
    }

    @JsonProperty("workspace_name")
    public void setWorkspaceName(java.lang.String workspaceName) {
        this.workspaceName = workspaceName;
    }

    public ReadsToLibraryParams withWorkspaceName(java.lang.String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }

    @JsonProperty("workspace_id")
    public Long getWorkspaceId() {
        return workspaceId;
    }

    @JsonProperty("workspace_id")
    public void setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ReadsToLibraryParams withWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    @JsonProperty("object_name")
    public java.lang.String getObjectName() {
        return objectName;
    }

    @JsonProperty("object_name")
    public void setObjectName(java.lang.String objectName) {
        this.objectName = objectName;
    }

    public ReadsToLibraryParams withObjectName(java.lang.String objectName) {
        this.objectName = objectName;
        return this;
    }

    @JsonProperty("object_id")
    public Long getObjectId() {
        return objectId;
    }

    @JsonProperty("object_id")
    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }

    public ReadsToLibraryParams withObjectId(Long objectId) {
        this.objectId = objectId;
        return this;
    }

    @JsonProperty("is_interleaved")
    public Long getIsInterleaved() {
        return isInterleaved;
    }

    @JsonProperty("is_interleaved")
    public void setIsInterleaved(Long isInterleaved) {
        this.isInterleaved = isInterleaved;
    }

    public ReadsToLibraryParams withIsInterleaved(Long isInterleaved) {
        this.isInterleaved = isInterleaved;
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

    public ReadsToLibraryParams withInsertSize(Double insertSize) {
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

    public ReadsToLibraryParams withStdDev(Double stdDev) {
        this.stdDev = stdDev;
        return this;
    }

    @JsonProperty("orientation_outward")
    public Long getOrientationOutward() {
        return orientationOutward;
    }

    @JsonProperty("orientation_outward")
    public void setOrientationOutward(Long orientationOutward) {
        this.orientationOutward = orientationOutward;
    }

    public ReadsToLibraryParams withOrientationOutward(Long orientationOutward) {
        this.orientationOutward = orientationOutward;
        return this;
    }

    @JsonProperty("sequencing_tech")
    public java.lang.String getSequencingTech() {
        return sequencingTech;
    }

    @JsonProperty("sequencing_tech")
    public void setSequencingTech(java.lang.String sequencingTech) {
        this.sequencingTech = sequencingTech;
    }

    public ReadsToLibraryParams withSequencingTech(java.lang.String sequencingTech) {
        this.sequencingTech = sequencingTech;
        return this;
    }

    @JsonProperty("single_genome")
    public Long getSingleGenome() {
        return singleGenome;
    }

    @JsonProperty("single_genome")
    public void setSingleGenome(Long singleGenome) {
        this.singleGenome = singleGenome;
    }

    public ReadsToLibraryParams withSingleGenome(Long singleGenome) {
        this.singleGenome = singleGenome;
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
        return ((((((((((((((((((((((((("ReadsToLibraryParams"+" [filePathList=")+ filePathList)+", workspaceName=")+ workspaceName)+", workspaceId=")+ workspaceId)+", objectName=")+ objectName)+", objectId=")+ objectId)+", isInterleaved=")+ isInterleaved)+", insertSize=")+ insertSize)+", stdDev=")+ stdDev)+", orientationOutward=")+ orientationOutward)+", sequencingTech=")+ sequencingTech)+", singleGenome=")+ singleGenome)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
