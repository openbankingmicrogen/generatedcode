package test.api;

import java.util.List;
import test.services.CreateUserI;
import test.model.CreateUserP;
import test.model.CreateUserResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import test.services.CreateUsersWithArrayInputI;
import test.model.CreateUsersWithArrayInputP;
import test.model.CreateUsersWithArrayInputResponseWrapper;
import test.services.CreateUsersWithListInputI;
import test.model.CreateUsersWithListInputP;
import test.model.CreateUsersWithListInputResponseWrapper;
import test.services.LoginUserI;
import test.model.LoginUserP;
import test.model.LoginUserResponseWrapper;
import test.services.LogoutUserI;
import test.model.LogoutUserP;
import test.model.LogoutUserResponseWrapper;
import test.services.GetUserByNameI;
import test.model.GetUserByNameP;
import test.model.GetUserByNameResponseWrapper;
import test.services.UpdateUserI;
import test.model.UpdateUserP;
import test.model.UpdateUserResponseWrapper;
import test.services.DeleteUserI;
import test.model.DeleteUserP;
import test.model.DeleteUserResponseWrapper;

import test.model.User;
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
import test.services.CreateUserI;
import test.model.CreateUserP;
import test.model.CreateUserResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import test.services.CreateUsersWithArrayInputI;
import test.model.CreateUsersWithArrayInputP;
import test.model.CreateUsersWithArrayInputResponseWrapper;
import test.services.CreateUsersWithListInputI;
import test.model.CreateUsersWithListInputP;
import test.model.CreateUsersWithListInputResponseWrapper;
import test.services.LoginUserI;
import test.model.LoginUserP;
import test.model.LoginUserResponseWrapper;
import test.services.LogoutUserI;
import test.model.LogoutUserP;
import test.model.LogoutUserResponseWrapper;
import test.services.GetUserByNameI;
import test.model.GetUserByNameP;
import test.model.GetUserByNameResponseWrapper;
import test.services.UpdateUserI;
import test.model.UpdateUserP;
import test.model.UpdateUserResponseWrapper;
import test.services.DeleteUserI;
import test.model.DeleteUserP;
import test.model.DeleteUserResponseWrapper;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-06T23:14:47.400Z")

@Controller
public class UserApiController implements UserApi {

	@Autowired
	DeleteUserI deleteUserI;


	@Autowired
	UpdateUserI updateUserI;


	@Autowired
	GetUserByNameI getUserByNameI;


	@Autowired
	LogoutUserI logoutUserI;


	@Autowired
	LoginUserI loginUserI;


	@Autowired
	CreateUsersWithListInputI createUsersWithListInputI;


	@Autowired
	CreateUsersWithArrayInputI createUsersWithArrayInputI;


	@Autowired
	CreateUserI createUserI;


    private static final Logger log = LoggerFactory.getLogger(UserApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UserApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> createUser(@ApiParam(value = "Created user object" ,required=true )  @Valid @RequestBody User body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> createUsersWithArrayInput(@ApiParam(value = "List of user object" ,required=true )  @Valid @RequestBody List<User> body) {
        
        CreateUsersWithArrayInputResponseWrapper res  = createUsersWithArrayInputI.execute(new CreateUsersWithArrayInputP());

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
}

    public ResponseEntity<Void> createUsersWithListInput(@ApiParam(value = "List of user object" ,required=true )  @Valid @RequestBody List<User> body) {
        
        CreateUsersWithListInputResponseWrapper res  = createUsersWithListInputI.execute(new CreateUsersWithListInputP());

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
}

    public ResponseEntity<Void> deleteUser(@ApiParam(value = "The name that needs to be deleted",required=true) @PathVariable("username") String username) {
        
        DeleteUserResponseWrapper res  = deleteUserI.execute(new DeleteUserP(username));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
}

    public ResponseEntity<User> getUserByName(@ApiParam(value = "The name that needs to be fetched. Use user1 for testing. ",required=true) @PathVariable("username") String username) {
        
        GetUserByNameResponseWrapper res  = getUserByNameI.execute(new GetUserByNameP(username));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
}

    public ResponseEntity<String> loginUser(@NotNull @ApiParam(value = "The user name for login", required = true) @Valid @RequestParam(value = "username", required = true) String username,@NotNull @ApiParam(value = "The password for login in clear text", required = true) @Valid @RequestParam(value = "password", required = true) String password) {
        
        LoginUserResponseWrapper res  = loginUserI.execute(new LoginUserP(username, password));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
}

    public ResponseEntity<Void> logoutUser() {
        
        LogoutUserResponseWrapper res  = logoutUserI.execute(new LogoutUserP());

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
}

    public ResponseEntity<Void> updateUser(@ApiParam(value = "name that need to be updated",required=true) @PathVariable("username") String username,@ApiParam(value = "Updated user object" ,required=true )  @Valid @RequestBody User body) {
        
        UpdateUserResponseWrapper res  = updateUserI.execute(new UpdateUserP(username, body));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
	} 
}
