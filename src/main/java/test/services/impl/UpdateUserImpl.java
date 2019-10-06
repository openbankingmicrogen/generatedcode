package test.services.impl;
 
import java.util.*;
 
import test.model.UpdateUserP;
import test.model.UpdateUserResponseWrapper;
import test.services.UpdateUserI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class UpdateUserImpl implements UpdateUserI {
 
    private static final Log logger = LogFactory.getLog(UpdateUserImpl.class);
   
    public UpdateUserResponseWrapper reliable(UpdateUserP pojo){ 
		//TODO
		return new UpdateUserResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public UpdateUserResponseWrapper execute(UpdateUserP requestParams){
        //TODO
        return new UpdateUserResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
