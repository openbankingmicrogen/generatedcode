package test.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

public class GetUserByNameResponseWrapper {

	private User response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public User getResponse(){
            return response;
	}
 
	public void setResponse(User response){
            this.response=response;
	} 
}
