package test.model;

import java.util.List;
import test.model.Pet;

public class FindPetsByStatusP {

    private List<String> status;

    public FindPetsByStatusP() {

    }

    public FindPetsByStatusP(List<String> status) {
        this.status = status;
    }

    public List<String> getStatus () {
        return status;
    }

    public void setStatus (List<String> status) {
        this.status = status;
    }

}
