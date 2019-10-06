package test.services;

import test.model.CreateUserP;
import test.model.CreateUserResponseWrapper;

public interface CreateUserI {

    public CreateUserResponseWrapper execute(CreateUserP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
