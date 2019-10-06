package test.services;

import test.model.DeletePetP;
import test.model.DeletePetResponseWrapper;

public interface DeletePetI {

    public DeletePetResponseWrapper execute(DeletePetP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
