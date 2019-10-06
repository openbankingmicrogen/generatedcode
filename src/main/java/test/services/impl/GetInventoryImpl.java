package test.services.impl;
 
import java.util.*;
 
import test.model.GetInventoryP;
import test.model.GetInventoryResponseWrapper;
import test.services.GetInventoryI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class GetInventoryImpl implements GetInventoryI {
 
    private static final Log logger = LogFactory.getLog(GetInventoryImpl.class);
   
    public GetInventoryResponseWrapper reliable(GetInventoryP pojo){ 
		//TODO
		return new GetInventoryResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public GetInventoryResponseWrapper execute(GetInventoryP requestParams){
        //TODO
        return new GetInventoryResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
