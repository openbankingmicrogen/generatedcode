package test.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

public class LoginUserResponseWrapper {

	private String response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public String getResponse(){
            return response;
	}
 
	public void setResponse(String response){
            this.response=response;
	} 
}
