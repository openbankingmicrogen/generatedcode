package test.services;

import test.model.PlaceOrderP;
import test.model.PlaceOrderResponseWrapper;

public interface PlaceOrderI {

    public PlaceOrderResponseWrapper execute(PlaceOrderP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
