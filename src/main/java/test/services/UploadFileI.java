package test.services;

import test.model.UploadFileP;
import test.model.UploadFileResponseWrapper;

public interface UploadFileI {

    public UploadFileResponseWrapper execute(UploadFileP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
