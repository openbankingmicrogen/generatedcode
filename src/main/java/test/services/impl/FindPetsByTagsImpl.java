package test.services.impl;
 
import java.util.*;
 
import test.model.FindPetsByTagsP;
import test.model.FindPetsByTagsResponseWrapper;
import test.services.FindPetsByTagsI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class FindPetsByTagsImpl implements FindPetsByTagsI {
 
    private static final Log logger = LogFactory.getLog(FindPetsByTagsImpl.class);
   
    public FindPetsByTagsResponseWrapper reliable(FindPetsByTagsP pojo){ 
		//TODO
		return new FindPetsByTagsResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public FindPetsByTagsResponseWrapper execute(FindPetsByTagsP requestParams){
        //TODO
        return new FindPetsByTagsResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
