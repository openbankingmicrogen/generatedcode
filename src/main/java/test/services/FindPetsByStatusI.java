package test.services;

import test.model.FindPetsByStatusP;
import test.model.FindPetsByStatusResponseWrapper;

public interface FindPetsByStatusI {

    public FindPetsByStatusResponseWrapper execute(FindPetsByStatusP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
