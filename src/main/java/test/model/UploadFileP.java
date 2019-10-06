package test.model;

import org.springframework.web.multipart.MultipartFile;
import test.model.ModelApiResponse;

public class UploadFileP {

    private long petId;
    private String additionalMetadata;
    private MultipartFile file;

    public UploadFileP() {

    }

    public UploadFileP(long petId,String additionalMetadata,MultipartFile file) {
        this.petId = petId;
        this.additionalMetadata = additionalMetadata;
        this.file = file;
    }

    public long getPetId () {
        return petId;
    }

    public void setPetId (long petId) {
        this.petId = petId;
    }
    public String getAdditionalMetadata () {
        return additionalMetadata;
    }

    public void setAdditionalMetadata (String additionalMetadata) {
        this.additionalMetadata = additionalMetadata;
    }
    public MultipartFile getFile () {
        return file;
    }

    public void setFile (MultipartFile file) {
        this.file = file;
    }

}
