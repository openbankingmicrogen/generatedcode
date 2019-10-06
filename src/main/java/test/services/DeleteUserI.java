package test.services;

import test.model.DeleteUserP;
import test.model.DeleteUserResponseWrapper;

public interface DeleteUserI {

    public DeleteUserResponseWrapper execute(DeleteUserP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
