package test.model;


public class DeletePetP {

    private String apiKey;
    private long petId;

    public DeletePetP() {

    }

    public DeletePetP(String apiKey,long petId) {
        this.apiKey = apiKey;
        this.petId = petId;
    }

    public String getApiKey () {
        return apiKey;
    }

    public void setApiKey (String apiKey) {
        this.apiKey = apiKey;
    }
    public long getPetId () {
        return petId;
    }

    public void setPetId (long petId) {
        this.petId = petId;
    }

}
