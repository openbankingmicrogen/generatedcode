package test.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import test.model.User;

@Repository
public interface UserRepo extends MongoRepository<User,String>{

}
