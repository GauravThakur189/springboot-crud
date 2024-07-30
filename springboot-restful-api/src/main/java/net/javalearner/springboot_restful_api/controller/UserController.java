package net.javalearner.springboot_restful_api.controller;


import lombok.AllArgsConstructor;
import net.javalearner.springboot_restful_api.controller.dto.UserDto;
import net.javalearner.springboot_restful_api.services.UserService;
//import org.apache.catalina.User;
import net.javalearner.springboot_restful_api.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserController {


    @Autowired
    private UserService userService;



    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto user){

        UserDto savedUser = userService.createService(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }


    @GetMapping("{Id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable("Id") Long userId){
        UserDto getUserData = userService.getUserById(userId);
        return new ResponseEntity<>(getUserData,HttpStatus.OK);
    }

    @GetMapping("get")
    public ResponseEntity<List<UserDto>> getAllUser(){
        List<UserDto> userList = userService.getAllUser();
        return new ResponseEntity<>(userList,HttpStatus.OK);
    }



    @PutMapping("{Id}")
    public ResponseEntity<UserDto> updateUser(@PathVariable("Id") Long userId ,@RequestBody UserDto user){
        user.setId(userId);
         UserDto updatedUser = userService.updateUser(user);
         return new ResponseEntity<>(updatedUser,HttpStatus.CREATED);
    }
}
