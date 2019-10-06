package test.services.impl;
 
import java.util.*;
 
import test.model.GetUserByNameP;
import test.model.GetUserByNameResponseWrapper;
import test.services.GetUserByNameI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class GetUserByNameImpl implements GetUserByNameI {
 
    private static final Log logger = LogFactory.getLog(GetUserByNameImpl.class);
   
    public GetUserByNameResponseWrapper reliable(GetUserByNameP pojo){ 
		//TODO
		return new GetUserByNameResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public GetUserByNameResponseWrapper execute(GetUserByNameP requestParams){
        //TODO
        return new GetUserByNameResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
