package test.services.impl;
 
import java.util.*;
 
import test.model.LoginUserP;
import test.model.LoginUserResponseWrapper;
import test.services.LoginUserI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class LoginUserImpl implements LoginUserI {
 
    private static final Log logger = LogFactory.getLog(LoginUserImpl.class);
   
    public LoginUserResponseWrapper reliable(LoginUserP pojo){ 
		//TODO
		return new LoginUserResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public LoginUserResponseWrapper execute(LoginUserP requestParams){
        //TODO
        return new LoginUserResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
