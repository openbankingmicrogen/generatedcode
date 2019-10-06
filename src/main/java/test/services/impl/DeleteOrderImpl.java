package test.services.impl;
 
import java.util.*;
 
import test.model.DeleteOrderP;
import test.model.DeleteOrderResponseWrapper;
import test.services.DeleteOrderI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class DeleteOrderImpl implements DeleteOrderI {
 
    private static final Log logger = LogFactory.getLog(DeleteOrderImpl.class);
   
    public DeleteOrderResponseWrapper reliable(DeleteOrderP pojo){ 
		//TODO
		return new DeleteOrderResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public DeleteOrderResponseWrapper execute(DeleteOrderP requestParams){
        //TODO
        return new DeleteOrderResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
