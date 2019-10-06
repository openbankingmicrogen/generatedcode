package test.services.impl;
 
import java.util.*;
 
import test.model.CreateUsersWithArrayInputP;
import test.model.CreateUsersWithArrayInputResponseWrapper;
import test.services.CreateUsersWithArrayInputI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class CreateUsersWithArrayInputImpl implements CreateUsersWithArrayInputI {
 
    private static final Log logger = LogFactory.getLog(CreateUsersWithArrayInputImpl.class);
   
    public CreateUsersWithArrayInputResponseWrapper reliable(CreateUsersWithArrayInputP pojo){ 
		//TODO
		return new CreateUsersWithArrayInputResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public CreateUsersWithArrayInputResponseWrapper execute(CreateUsersWithArrayInputP requestParams){
        //TODO
        return new CreateUsersWithArrayInputResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
