package test.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import test.model.Order;

@Repository
public interface OrderRepo extends MongoRepository<Order,String>{

}
