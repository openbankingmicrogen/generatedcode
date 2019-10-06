package test.model;


public class UpdatePetWithFormP {

    private long petId;
    private String name;
    private String status;

    public UpdatePetWithFormP() {

    }

    public UpdatePetWithFormP(long petId,String name,String status) {
        this.petId = petId;
        this.name = name;
        this.status = status;
    }

    public long getPetId () {
        return petId;
    }

    public void setPetId (long petId) {
        this.petId = petId;
    }
    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }
    public String getStatus () {
        return status;
    }

    public void setStatus (String status) {
        this.status = status;
    }

}
