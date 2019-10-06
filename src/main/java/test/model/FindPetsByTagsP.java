package test.model;

import java.util.List;
import test.model.Pet;

public class FindPetsByTagsP {

    private List<String> tags;

    public FindPetsByTagsP() {

    }

    public FindPetsByTagsP(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getTags () {
        return tags;
    }

    public void setTags (List<String> tags) {
        this.tags = tags;
    }

}
