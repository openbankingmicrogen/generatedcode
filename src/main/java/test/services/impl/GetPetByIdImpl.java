package test.services.impl;
 
import java.util.*;
 
import test.model.GetPetByIdP;
import test.model.GetPetByIdResponseWrapper;
import test.services.GetPetByIdI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class GetPetByIdImpl implements GetPetByIdI {
 
    private static final Log logger = LogFactory.getLog(GetPetByIdImpl.class);
   
    public GetPetByIdResponseWrapper reliable(GetPetByIdP pojo){ 
		//TODO
		return new GetPetByIdResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public GetPetByIdResponseWrapper execute(GetPetByIdP requestParams){
        //TODO
        return new GetPetByIdResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
