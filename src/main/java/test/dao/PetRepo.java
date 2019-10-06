package test.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import test.model.Pet;

@Repository
public interface PetRepo extends MongoRepository<Pet,String>{

}
