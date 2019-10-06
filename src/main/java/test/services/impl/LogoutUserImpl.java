package test.services.impl;
 
import java.util.*;
 
import test.model.LogoutUserP;
import test.model.LogoutUserResponseWrapper;
import test.services.LogoutUserI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class LogoutUserImpl implements LogoutUserI {
 
    private static final Log logger = LogFactory.getLog(LogoutUserImpl.class);
   
    public LogoutUserResponseWrapper reliable(LogoutUserP pojo){ 
		//TODO
		return new LogoutUserResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public LogoutUserResponseWrapper execute(LogoutUserP requestParams){
        //TODO
        return new LogoutUserResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
