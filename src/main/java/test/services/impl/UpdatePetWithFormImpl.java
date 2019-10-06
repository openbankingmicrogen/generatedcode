package test.services.impl;
 
import java.util.*;
 
import test.model.UpdatePetWithFormP;
import test.model.UpdatePetWithFormResponseWrapper;
import test.services.UpdatePetWithFormI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class UpdatePetWithFormImpl implements UpdatePetWithFormI {
 
    private static final Log logger = LogFactory.getLog(UpdatePetWithFormImpl.class);
   
    public UpdatePetWithFormResponseWrapper reliable(UpdatePetWithFormP pojo){ 
		//TODO
		return new UpdatePetWithFormResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public UpdatePetWithFormResponseWrapper execute(UpdatePetWithFormP requestParams){
        //TODO
        return new UpdatePetWithFormResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
