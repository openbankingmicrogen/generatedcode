package test.services;

import test.model.GetPetByIdP;
import test.model.GetPetByIdResponseWrapper;

public interface GetPetByIdI {

    public GetPetByIdResponseWrapper execute(GetPetByIdP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
