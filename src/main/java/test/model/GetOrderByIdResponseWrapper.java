package test.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

public class GetOrderByIdResponseWrapper {

	private Order response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public Order getResponse(){
            return response;
	}
 
	public void setResponse(Order response){
            this.response=response;
	} 
}
