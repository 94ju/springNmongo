package com.example.demoMongo.resource;

import com.example.demoMongo.document.Users;
import com.example.demoMongo.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResource {

    private UserRepository userRepository;

    public UserResource(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @GetMapping("/all")
    public List<Users> getUsers(){
            return userRepository.findAll();
    }

}
