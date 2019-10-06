package test.services.impl;
 
import java.util.*;
 
import test.model.UpdatePetP;
import test.model.UpdatePetResponseWrapper;
import test.services.UpdatePetI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class UpdatePetImpl implements UpdatePetI {
 
    private static final Log logger = LogFactory.getLog(UpdatePetImpl.class);
   
    public UpdatePetResponseWrapper reliable(UpdatePetP pojo){ 
		//TODO
		return new UpdatePetResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public UpdatePetResponseWrapper execute(UpdatePetP requestParams){
        //TODO
        return new UpdatePetResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
