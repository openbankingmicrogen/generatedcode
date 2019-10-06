package test.services;

import test.model.UpdatePetP;
import test.model.UpdatePetResponseWrapper;

public interface UpdatePetI {

    public UpdatePetResponseWrapper execute(UpdatePetP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
