package com.example.demoMongo.repository;

import com.example.demoMongo.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Users,Integer>{

}
