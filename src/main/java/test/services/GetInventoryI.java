package test.services;

import test.model.GetInventoryP;
import test.model.GetInventoryResponseWrapper;

public interface GetInventoryI {

    public GetInventoryResponseWrapper execute(GetInventoryP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
