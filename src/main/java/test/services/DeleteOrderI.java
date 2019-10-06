package test.services;

import test.model.DeleteOrderP;
import test.model.DeleteOrderResponseWrapper;

public interface DeleteOrderI {

    public DeleteOrderResponseWrapper execute(DeleteOrderP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
