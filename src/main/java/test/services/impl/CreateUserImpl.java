package test.services.impl;
 
import java.util.*;
 
import test.model.CreateUserP;
import test.model.CreateUserResponseWrapper;
import test.services.CreateUserI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class CreateUserImpl implements CreateUserI {
 
    private static final Log logger = LogFactory.getLog(CreateUserImpl.class);
   
    public CreateUserResponseWrapper reliable(CreateUserP pojo){ 
		//TODO
		return new CreateUserResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public CreateUserResponseWrapper execute(CreateUserP requestParams){
        //TODO
        return new CreateUserResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
