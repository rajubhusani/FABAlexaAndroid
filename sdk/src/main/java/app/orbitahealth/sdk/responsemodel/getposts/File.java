package app.orbitahealth.sdk.responsemodel.getposts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class File {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("fileName")
    @Expose
    private String fileName;
    @SerializedName("fileExt")
    @Expose
    private String fileExt;
    @SerializedName("fileSrc")
    @Expose
    private String fileSrc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileExt() {
        return fileExt;
    }

    public void setFileExt(String fileExt) {
        this.fileExt = fileExt;
    }

    public String getFileSrc() {
        return fileSrc;
    }

    public void setFileSrc(String fileSrc) {
        this.fileSrc = fileSrc;
    }

}
