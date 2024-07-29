package net.javalearner.springboot_restful_api.services;

import net.javalearner.springboot_restful_api.entity.User;

import java.util.List;

public interface UserService {
     User createService(User user);

     User getUserById(Long userId);

     List<User> getAllUser();

     User updateUser(User user);

}
