package test.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

public class UploadFileResponseWrapper {

	private ModelApiResponse response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public ModelApiResponse getResponse(){
            return response;
	}
 
	public void setResponse(ModelApiResponse response){
            this.response=response;
	} 
}
