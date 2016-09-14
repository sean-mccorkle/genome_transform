
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
 * <p>Original spec-file type: rnaSeqMeta</p>
 * <pre>
 * Input parameters for the "reads to assembly" function.
 * shock_ref shock_ref - optional URL to genbank file stored in Shock
 * file_path file_path - optional path to genbank file on local file system
 * workspace_id workspace - workspace where object will be saved
 * object_id reads_id - workspace ID to which the genome object should be saved
 * object_id contigset_id - workspace ID to which the contigs should be saved
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "domain",
    "platform",
    "sample_id",
    "condition",
    "source",
    "Library_type",
    "publication_Id",
    "external_source_date",
    "sra"
})
public class RnaSeqMeta {

    @JsonProperty("domain")
    private String domain;
    @JsonProperty("platform")
    private String platform;
    @JsonProperty("sample_id")
    private String sampleId;
    @JsonProperty("condition")
    private String condition;
    @JsonProperty("source")
    private String source;
    @JsonProperty("Library_type")
    private String LibraryType;
    @JsonProperty("publication_Id")
    private String publicationId;
    @JsonProperty("external_source_date")
    private String externalSourceDate;
    @JsonProperty("sra")
    private String sra;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("domain")
    public String getDomain() {
        return domain;
    }

    @JsonProperty("domain")
    public void setDomain(String domain) {
        this.domain = domain;
    }

    public RnaSeqMeta withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    @JsonProperty("platform")
    public String getPlatform() {
        return platform;
    }

    @JsonProperty("platform")
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public RnaSeqMeta withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    @JsonProperty("sample_id")
    public String getSampleId() {
        return sampleId;
    }

    @JsonProperty("sample_id")
    public void setSampleId(String sampleId) {
        this.sampleId = sampleId;
    }

    public RnaSeqMeta withSampleId(String sampleId) {
        this.sampleId = sampleId;
        return this;
    }

    @JsonProperty("condition")
    public String getCondition() {
        return condition;
    }

    @JsonProperty("condition")
    public void setCondition(String condition) {
        this.condition = condition;
    }

    public RnaSeqMeta withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    public RnaSeqMeta withSource(String source) {
        this.source = source;
        return this;
    }

    @JsonProperty("Library_type")
    public String getLibraryType() {
        return LibraryType;
    }

    @JsonProperty("Library_type")
    public void setLibraryType(String LibraryType) {
        this.LibraryType = LibraryType;
    }

    public RnaSeqMeta withLibraryType(String LibraryType) {
        this.LibraryType = LibraryType;
        return this;
    }

    @JsonProperty("publication_Id")
    public String getPublicationId() {
        return publicationId;
    }

    @JsonProperty("publication_Id")
    public void setPublicationId(String publicationId) {
        this.publicationId = publicationId;
    }

    public RnaSeqMeta withPublicationId(String publicationId) {
        this.publicationId = publicationId;
        return this;
    }

    @JsonProperty("external_source_date")
    public String getExternalSourceDate() {
        return externalSourceDate;
    }

    @JsonProperty("external_source_date")
    public void setExternalSourceDate(String externalSourceDate) {
        this.externalSourceDate = externalSourceDate;
    }

    public RnaSeqMeta withExternalSourceDate(String externalSourceDate) {
        this.externalSourceDate = externalSourceDate;
        return this;
    }

    @JsonProperty("sra")
    public String getSra() {
        return sra;
    }

    @JsonProperty("sra")
    public void setSra(String sra) {
        this.sra = sra;
    }

    public RnaSeqMeta withSra(String sra) {
        this.sra = sra;
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
        return ((((((((((((((((((((("RnaSeqMeta"+" [domain=")+ domain)+", platform=")+ platform)+", sampleId=")+ sampleId)+", condition=")+ condition)+", source=")+ source)+", LibraryType=")+ LibraryType)+", publicationId=")+ publicationId)+", externalSourceDate=")+ externalSourceDate)+", sra=")+ sra)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
