package test.services.impl;
 
import java.util.*;
 
import test.model.AddPetP;
import test.model.AddPetResponseWrapper;
import test.services.AddPetI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class AddPetImpl implements AddPetI {
 
    private static final Log logger = LogFactory.getLog(AddPetImpl.class);
   
    public AddPetResponseWrapper reliable(AddPetP pojo){ 
		//TODO
		return new AddPetResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public AddPetResponseWrapper execute(AddPetP requestParams){
        //TODO
        return new AddPetResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
