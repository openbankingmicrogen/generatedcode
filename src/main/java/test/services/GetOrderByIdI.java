package test.services;

import test.model.GetOrderByIdP;
import test.model.GetOrderByIdResponseWrapper;

public interface GetOrderByIdI {

    public GetOrderByIdResponseWrapper execute(GetOrderByIdP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
