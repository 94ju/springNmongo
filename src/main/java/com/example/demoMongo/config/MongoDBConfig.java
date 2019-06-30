package com.example.demoMongo.config;

import com.example.demoMongo.document.Users;
import com.example.demoMongo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBConfig {
//    @Bean
//    CommandLineRunner commandLineRunner(UserRepository userRepository) {
//        return strings -> {
//            userRepository.save(new Users(1, "Peter", 12345));
//            userRepository.save(new Users(2, "Sam", 1234));
//        };
//    }
}
