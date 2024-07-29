package net.javalearner.springboot_restful_api.services.impl;

import net.javalearner.springboot_restful_api.entity.User;
import net.javalearner.springboot_restful_api.repository.UserRepository;
import net.javalearner.springboot_restful_api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createService(User user) {
        return userRepository.save(user);
    }

    @Override
    public void gauravService(String name) {

    }
}
