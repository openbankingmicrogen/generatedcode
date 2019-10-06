package test.api;

import java.util.Map;
import test.model.Order;
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
import test.services.GetInventoryI;
import test.model.GetInventoryP;
import test.model.GetInventoryResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import test.services.PlaceOrderI;
import test.model.PlaceOrderP;
import test.model.PlaceOrderResponseWrapper;
import test.services.GetOrderByIdI;
import test.model.GetOrderByIdP;
import test.model.GetOrderByIdResponseWrapper;
import test.services.DeleteOrderI;
import test.model.DeleteOrderP;
import test.model.DeleteOrderResponseWrapper;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-06T23:14:47.400Z")

@Controller
public class StoreApiController implements StoreApi {

	@Autowired
	DeleteOrderI deleteOrderI;


	@Autowired
	GetOrderByIdI getOrderByIdI;


	@Autowired
	PlaceOrderI placeOrderI;


	@Autowired
	GetInventoryI getInventoryI;


    private static final Logger log = LoggerFactory.getLogger(StoreApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public StoreApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> deleteOrder(@Min(1)@ApiParam(value = "ID of the order that needs to be deleted",required=true) @PathVariable("orderId") Long orderId) {
        
        DeleteOrderResponseWrapper res  = deleteOrderI.execute(new DeleteOrderP(orderId));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
}

    public ResponseEntity<Map<String, Integer>> getInventory() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Map<String, Integer>>(objectMapper.readValue("{  \"key\" : 0}", Map.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Map<String, Integer>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Map<String, Integer>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Order> getOrderById(@Min(1) @Max(10) @ApiParam(value = "ID of pet that needs to be fetched",required=true) @PathVariable("orderId") Long orderId) {
        
        GetOrderByIdResponseWrapper res  = getOrderByIdI.execute(new GetOrderByIdP(orderId));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
}

    public ResponseEntity<Order> placeOrder(@ApiParam(value = "order placed for purchasing the pet" ,required=true )  @Valid @RequestBody Order body) {
        
        PlaceOrderResponseWrapper res  = placeOrderI.execute(new PlaceOrderP());

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
	} 
}
