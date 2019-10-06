package test.services;

import test.model.CreateUsersWithArrayInputP;
import test.model.CreateUsersWithArrayInputResponseWrapper;

public interface CreateUsersWithArrayInputI {

    public CreateUsersWithArrayInputResponseWrapper execute(CreateUsersWithArrayInputP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
