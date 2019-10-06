package test.services;

import test.model.UpdatePetWithFormP;
import test.model.UpdatePetWithFormResponseWrapper;

public interface UpdatePetWithFormI {

    public UpdatePetWithFormResponseWrapper execute(UpdatePetWithFormP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
