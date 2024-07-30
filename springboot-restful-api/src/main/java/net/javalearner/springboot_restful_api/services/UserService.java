package net.javalearner.springboot_restful_api.services;

import net.javalearner.springboot_restful_api.controller.dto.UserDto;
import net.javalearner.springboot_restful_api.entity.User;

import java.util.List;

public interface UserService {
     UserDto createService(UserDto user);

     User getUserById(Long userId);

     List<User> getAllUser();

     User updateUser(User user);

}
