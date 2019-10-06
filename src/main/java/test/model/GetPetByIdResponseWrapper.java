package test.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

public class GetPetByIdResponseWrapper {

	private Pet response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public Pet getResponse(){
            return response;
	}
 
	public void setResponse(Pet response){
            this.response=response;
	} 
}
