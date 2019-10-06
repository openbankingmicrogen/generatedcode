package test.services.impl;
 
import java.util.*;
 
import test.model.DeletePetP;
import test.model.DeletePetResponseWrapper;
import test.services.DeletePetI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class DeletePetImpl implements DeletePetI {
 
    private static final Log logger = LogFactory.getLog(DeletePetImpl.class);
   
    public DeletePetResponseWrapper reliable(DeletePetP pojo){ 
		//TODO
		return new DeletePetResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public DeletePetResponseWrapper execute(DeletePetP requestParams){
        //TODO
        return new DeletePetResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
