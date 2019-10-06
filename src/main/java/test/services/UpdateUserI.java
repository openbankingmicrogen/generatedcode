package test.services;

import test.model.UpdateUserP;
import test.model.UpdateUserResponseWrapper;

public interface UpdateUserI {

    public UpdateUserResponseWrapper execute(UpdateUserP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
