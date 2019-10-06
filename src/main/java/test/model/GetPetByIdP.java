package test.model;

import test.model.Pet;

public class GetPetByIdP {

    private long petId;

    public GetPetByIdP() {

    }

    public GetPetByIdP(long petId) {
        this.petId = petId;
    }

    public long getPetId () {
        return petId;
    }

    public void setPetId (long petId) {
        this.petId = petId;
    }

}
