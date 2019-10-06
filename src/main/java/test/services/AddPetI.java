package test.services;

import test.model.AddPetP;
import test.model.AddPetResponseWrapper;

public interface AddPetI {

    public AddPetResponseWrapper execute(AddPetP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
