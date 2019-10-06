package test.api;

import test.model.ModelApiResponse;
import test.model.Pet;
import org.springframework.core.io.Resource;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import test.services.UpdatePetI;
import test.model.UpdatePetP;
import test.model.UpdatePetResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import test.services.AddPetI;
import test.model.AddPetP;
import test.model.AddPetResponseWrapper;
import test.services.FindPetsByStatusI;
import test.model.FindPetsByStatusP;
import test.model.FindPetsByStatusResponseWrapper;
import test.services.FindPetsByTagsI;
import test.model.FindPetsByTagsP;
import test.model.FindPetsByTagsResponseWrapper;
import test.services.GetPetByIdI;
import test.model.GetPetByIdP;
import test.model.GetPetByIdResponseWrapper;
import test.services.UpdatePetWithFormI;
import test.model.UpdatePetWithFormP;
import test.model.UpdatePetWithFormResponseWrapper;
import test.services.DeletePetI;
import test.model.DeletePetP;
import test.model.DeletePetResponseWrapper;
import test.services.UploadFileI;
import test.model.UploadFileP;
import test.model.UploadFileResponseWrapper;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-06T23:14:47.400Z")

@Controller
public class PetApiController implements PetApi {

	@Autowired
	UploadFileI uploadFileI;


	@Autowired
	DeletePetI deletePetI;


	@Autowired
	UpdatePetWithFormI updatePetWithFormI;


	@Autowired
	GetPetByIdI getPetByIdI;


	@Autowired
	FindPetsByTagsI findPetsByTagsI;


	@Autowired
	FindPetsByStatusI findPetsByStatusI;


	@Autowired
	AddPetI addPetI;


	@Autowired
	UpdatePetI updatePetI;


    private static final Logger log = LoggerFactory.getLogger(PetApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PetApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addPet(@ApiParam(value = "Pet object that needs to be added to the store" ,required=true )  @Valid @RequestBody Pet body) {
        
        AddPetResponseWrapper res  = addPetI.execute(new AddPetP());

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
}

    public ResponseEntity<Void> deletePet(@ApiParam(value = "Pet id to delete",required=true) @PathVariable("petId") Long petId,@ApiParam(value = "" ) @RequestHeader(value="api_key", required=false) String apiKey) {
        
        DeletePetResponseWrapper res  = deletePetI.execute(new DeletePetP(apiKey, petId));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
}

    public ResponseEntity<List<Pet>> findPetsByStatus(@NotNull @ApiParam(value = "Status values that need to be considered for filter", required = true, allowableValues = "available, pending, sold") @Valid @RequestParam(value = "status", required = true) List<String> status) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<List<Pet>>(objectMapper.readValue("<Pet>  <id>123456789</id>  <name>doggie</name>  <photoUrls>    <photoUrls>aeiou</photoUrls>  </photoUrls>  <tags>  </tags>  <status>aeiou</status></Pet>", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<List<Pet>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Pet>>(objectMapper.readValue("[ {  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ],  \"name\" : \"doggie\",  \"id\" : 0,  \"category\" : {    \"name\" : \"name\",    \"id\" : 6  },  \"tags\" : [ {    \"name\" : \"name\",    \"id\" : 1  }, {    \"name\" : \"name\",    \"id\" : 1  } ],  \"status\" : \"available\"}, {  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ],  \"name\" : \"doggie\",  \"id\" : 0,  \"category\" : {    \"name\" : \"name\",    \"id\" : 6  },  \"tags\" : [ {    \"name\" : \"name\",    \"id\" : 1  }, {    \"name\" : \"name\",    \"id\" : 1  } ],  \"status\" : \"available\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Pet>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Pet>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Pet>> findPetsByTags(@NotNull @ApiParam(value = "Tags to filter by", required = true) @Valid @RequestParam(value = "tags", required = true) List<String> tags) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<List<Pet>>(objectMapper.readValue("<Pet>  <id>123456789</id>  <name>doggie</name>  <photoUrls>    <photoUrls>aeiou</photoUrls>  </photoUrls>  <tags>  </tags>  <status>aeiou</status></Pet>", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<List<Pet>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Pet>>(objectMapper.readValue("[ {  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ],  \"name\" : \"doggie\",  \"id\" : 0,  \"category\" : {    \"name\" : \"name\",    \"id\" : 6  },  \"tags\" : [ {    \"name\" : \"name\",    \"id\" : 1  }, {    \"name\" : \"name\",    \"id\" : 1  } ],  \"status\" : \"available\"}, {  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ],  \"name\" : \"doggie\",  \"id\" : 0,  \"category\" : {    \"name\" : \"name\",    \"id\" : 6  },  \"tags\" : [ {    \"name\" : \"name\",    \"id\" : 1  }, {    \"name\" : \"name\",    \"id\" : 1  } ],  \"status\" : \"available\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Pet>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Pet>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Pet> getPetById(@ApiParam(value = "ID of pet to return",required=true) @PathVariable("petId") Long petId) {
        
        GetPetByIdResponseWrapper res  = getPetByIdI.execute(new GetPetByIdP(petId));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
}

    public ResponseEntity<Void> updatePet(@ApiParam(value = "Pet object that needs to be added to the store" ,required=true )  @Valid @RequestBody Pet body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updatePetWithForm(@ApiParam(value = "ID of pet that needs to be updated",required=true) @PathVariable("petId") Long petId,@ApiParam(value = "Updated name of the pet") @RequestParam(value="name", required=false)  String name,@ApiParam(value = "Updated status of the pet") @RequestParam(value="status", required=false)  String status) {
        
        UpdatePetWithFormResponseWrapper res  = updatePetWithFormI.execute(new UpdatePetWithFormP(petId, name, status));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
}

    public ResponseEntity<ModelApiResponse> uploadFile(@ApiParam(value = "ID of pet to update",required=true) @PathVariable("petId") Long petId,@ApiParam(value = "Additional data to pass to server") @RequestParam(value="additionalMetadata", required=false)  String additionalMetadata,@ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile file) {
        
        UploadFileResponseWrapper res  = uploadFileI.execute(new UploadFileP(petId, additionalMetadata, file));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
	} 
}
