package net.javalearner.springboot_restful_api.controller;


import lombok.AllArgsConstructor;
import net.javalearner.springboot_restful_api.services.UserService;
//import org.apache.catalina.User;
import net.javalearner.springboot_restful_api.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserController {


    @Autowired
    private UserService userService;



    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){

        User savedUser = userService.createService(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);



    }
}
