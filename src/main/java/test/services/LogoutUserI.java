package test.services;

import test.model.LogoutUserP;
import test.model.LogoutUserResponseWrapper;

public interface LogoutUserI {

    public LogoutUserResponseWrapper execute(LogoutUserP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
