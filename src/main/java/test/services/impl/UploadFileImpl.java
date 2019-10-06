package test.services.impl;
 
import java.util.*;
 
import test.model.UploadFileP;
import test.model.UploadFileResponseWrapper;
import test.services.UploadFileI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class UploadFileImpl implements UploadFileI {
 
    private static final Log logger = LogFactory.getLog(UploadFileImpl.class);
   
    public UploadFileResponseWrapper reliable(UploadFileP pojo){ 
		//TODO
		return new UploadFileResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public UploadFileResponseWrapper execute(UploadFileP requestParams){
        //TODO
        return new UploadFileResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
