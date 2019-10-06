package test.services;

import test.model.GetUserByNameP;
import test.model.GetUserByNameResponseWrapper;

public interface GetUserByNameI {

    public GetUserByNameResponseWrapper execute(GetUserByNameP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
