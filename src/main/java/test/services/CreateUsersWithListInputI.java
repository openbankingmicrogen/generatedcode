package test.services;

import test.model.CreateUsersWithListInputP;
import test.model.CreateUsersWithListInputResponseWrapper;

public interface CreateUsersWithListInputI {

    public CreateUsersWithListInputResponseWrapper execute(CreateUsersWithListInputP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
