package test.services.impl;
 
import java.util.*;
 
import test.model.DeleteUserP;
import test.model.DeleteUserResponseWrapper;
import test.services.DeleteUserI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class DeleteUserImpl implements DeleteUserI {
 
    private static final Log logger = LogFactory.getLog(DeleteUserImpl.class);
   
    public DeleteUserResponseWrapper reliable(DeleteUserP pojo){ 
		//TODO
		return new DeleteUserResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public DeleteUserResponseWrapper execute(DeleteUserP requestParams){
        //TODO
        return new DeleteUserResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
