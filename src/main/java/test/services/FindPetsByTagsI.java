package test.services;

import test.model.FindPetsByTagsP;
import test.model.FindPetsByTagsResponseWrapper;

public interface FindPetsByTagsI {

    public FindPetsByTagsResponseWrapper execute(FindPetsByTagsP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
