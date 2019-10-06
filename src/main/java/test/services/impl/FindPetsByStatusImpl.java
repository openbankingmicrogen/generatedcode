package test.services.impl;
 
import java.util.*;
 
import test.model.FindPetsByStatusP;
import test.model.FindPetsByStatusResponseWrapper;
import test.services.FindPetsByStatusI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class FindPetsByStatusImpl implements FindPetsByStatusI {
 
    private static final Log logger = LogFactory.getLog(FindPetsByStatusImpl.class);
   
    public FindPetsByStatusResponseWrapper reliable(FindPetsByStatusP pojo){ 
		//TODO
		return new FindPetsByStatusResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public FindPetsByStatusResponseWrapper execute(FindPetsByStatusP requestParams){
        //TODO
        return new FindPetsByStatusResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
