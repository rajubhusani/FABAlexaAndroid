package app.orbitahealth.sdk;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)

@JsonPropertyOrder({
        "fieldname",
        "originalname",
        "encoding",
        "mimetype",
        "destination",
        "name",
        "path",
        "size",
        "originalName",
        "validFile",
        "extension",
        "mediaType",
        "avatarSrcLarge",
        "imageSrc"
})
public class ImageUploadResponse {

    @JsonProperty("fieldname")
    private String fieldname;
    @JsonProperty("originalname")
    private String originalname;
    @JsonProperty("encoding")
    private String encoding;
    @JsonProperty("mimetype")
    private String mimetype;
    @JsonProperty("destination")
    private String destination;
    @JsonProperty("name")
    private String name;
    @JsonProperty("path")
    private String path;
    @JsonProperty("size")
    private Integer size;
    @JsonProperty("originalName")
    private String originalName;
    @JsonProperty("validFile")
    private Boolean validFile;
    @JsonProperty("extension")
    private String extension;
    @JsonProperty("mediaType")
    private String mediaType;
    @JsonProperty("avatarSrcLarge")
    private String avatarSrcLarge;
    @JsonProperty("imageSrc")
    private String imageSrc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The fieldname
     */
    @JsonProperty("fieldname")
    public String getFieldname() {
        return fieldname;
    }

    /**
     *
     * @param fieldname
     * The fieldname
     */
    @JsonProperty("fieldname")
    public void setFieldname(String fieldname) {
        this.fieldname = fieldname;
    }

    /**
     *
     * @return
     * The originalname
     */
    @JsonProperty("originalname")
    public String getOriginalname() {
        return originalname;
    }

    /**
     *
     * @param originalname
     * The originalname
     */
    @JsonProperty("originalname")
    public void setOriginalname(String originalname) {
        this.originalname = originalname;
    }

    /**
     *
     * @return
     * The encoding
     */
    @JsonProperty("encoding")
    public String getEncoding() {
        return encoding;
    }

    /**
     *
     * @param encoding
     * The encoding
     */
    @JsonProperty("encoding")
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    /**
     *
     * @return
     * The mimetype
     */
    @JsonProperty("mimetype")
    public String getMimetype() {
        return mimetype;
    }

    /**
     *
     * @param mimetype
     * The mimetype
     */
    @JsonProperty("mimetype")
    public void setMimetype(String mimetype) {
        this.mimetype = mimetype;
    }

    /**
     *
     * @return
     * The destination
     */
    @JsonProperty("destination")
    public String getDestination() {
        return destination;
    }

    /**
     *
     * @param destination
     * The destination
     */
    @JsonProperty("destination")
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     *
     * @return
     * The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The path
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     *
     * @param path
     * The path
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    /**
     *
     * @return
     * The size
     */
    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The originalName
     */
    @JsonProperty("originalName")
    public String getOriginalName() {
        return originalName;
    }

    /**
     *
     * @param originalName
     * The originalName
     */
    @JsonProperty("originalName")
    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    /**
     *
     * @return
     * The validFile
     */
    @JsonProperty("validFile")
    public Boolean getValidFile() {
        return validFile;
    }

    /**
     *
     * @param validFile
     * The validFile
     */
    @JsonProperty("validFile")
    public void setValidFile(Boolean validFile) {
        this.validFile = validFile;
    }

    /**
     *
     * @return
     * The extension
     */
    @JsonProperty("extension")
    public String getExtension() {
        return extension;
    }

    /**
     *
     * @param extension
     * The extension
     */
    @JsonProperty("extension")
    public void setExtension(String extension) {
        this.extension = extension;
    }

    /**
     *
     * @return
     * The mediaType
     */
    @JsonProperty("mediaType")
    public String getMediaType() {
        return mediaType;
    }

    /**
     *
     * @param mediaType
     * The mediaType
     */
    @JsonProperty("mediaType")
    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    /**
     *
     * @return
     * The avatarSrcLarge
     */
    @JsonProperty("avatarSrcLarge")
    public String getAvatarSrcLarge() {
        return avatarSrcLarge;
    }

    /**
     *
     * @param avatarSrcLarge
     * The avatarSrcLarge
     */
    @JsonProperty("avatarSrcLarge")
    public void setAvatarSrcLarge(String avatarSrcLarge) {
        this.avatarSrcLarge = avatarSrcLarge;
    }

    /**
     *
     * @return
     * The imageSrc
     */
    @JsonProperty("imageSrc")
    public String getImageSrc() {
        return imageSrc;
    }

    /**
     *
     * @param imageSrc
     * The imageSrc
     */
    @JsonProperty("imageSrc")
    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}