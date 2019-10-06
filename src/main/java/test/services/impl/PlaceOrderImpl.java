package test.services.impl;
 
import java.util.*;
 
import test.model.PlaceOrderP;
import test.model.PlaceOrderResponseWrapper;
import test.services.PlaceOrderI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class PlaceOrderImpl implements PlaceOrderI {
 
    private static final Log logger = LogFactory.getLog(PlaceOrderImpl.class);
   
    public PlaceOrderResponseWrapper reliable(PlaceOrderP pojo){ 
		//TODO
		return new PlaceOrderResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public PlaceOrderResponseWrapper execute(PlaceOrderP requestParams){
        //TODO
        return new PlaceOrderResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
