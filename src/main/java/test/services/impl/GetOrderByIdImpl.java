package test.services.impl;
 
import java.util.*;
 
import test.model.GetOrderByIdP;
import test.model.GetOrderByIdResponseWrapper;
import test.services.GetOrderByIdI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class GetOrderByIdImpl implements GetOrderByIdI {
 
    private static final Log logger = LogFactory.getLog(GetOrderByIdImpl.class);
   
    public GetOrderByIdResponseWrapper reliable(GetOrderByIdP pojo){ 
		//TODO
		return new GetOrderByIdResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public GetOrderByIdResponseWrapper execute(GetOrderByIdP requestParams){
        //TODO
        return new GetOrderByIdResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
