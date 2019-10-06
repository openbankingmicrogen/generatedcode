package test.services.impl;
 
import java.util.*;
 
import test.model.CreateUsersWithListInputP;
import test.model.CreateUsersWithListInputResponseWrapper;
import test.services.CreateUsersWithListInputI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class CreateUsersWithListInputImpl implements CreateUsersWithListInputI {
 
    private static final Log logger = LogFactory.getLog(CreateUsersWithListInputImpl.class);
   
    public CreateUsersWithListInputResponseWrapper reliable(CreateUsersWithListInputP pojo){ 
		//TODO
		return new CreateUsersWithListInputResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public CreateUsersWithListInputResponseWrapper execute(CreateUsersWithListInputP requestParams){
        //TODO
        return new CreateUsersWithListInputResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
