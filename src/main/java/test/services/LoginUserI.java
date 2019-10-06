package test.services;

import test.model.LoginUserP;
import test.model.LoginUserResponseWrapper;

public interface LoginUserI {

    public LoginUserResponseWrapper execute(LoginUserP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
