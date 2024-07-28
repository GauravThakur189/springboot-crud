package net.javalearner.springboot_restful_api.services.impl;

import net.javalearner.springboot_restful_api.entity.User;
import net.javalearner.springboot_restful_api.repository.UserRepository;
import net.javalearner.springboot_restful_api.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private UserRepository userRepository;

    @Override
    public User userService(User user) {
        return null;
    }

    @Override
    public void gauravService(String name) {

    }
}
