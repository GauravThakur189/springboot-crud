package net.javalearner.springboot_restful_api.services.impl;

import lombok.AllArgsConstructor;
import net.javalearner.springboot_restful_api.entity.User;
import net.javalearner.springboot_restful_api.repository.UserRepository;
import net.javalearner.springboot_restful_api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {



    @Autowired
    private UserRepository userRepository;

    @Override
    public User createService(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long userId) {
        Optional<User> optionalUser =  userRepository.findById(userId);
        return optionalUser.get();
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
        User userId   = userRepository.findById(user.getId()).get();
        userId.setFirstName(user.getFirstName());
        userId.setLastName(user.getLastName());
      return  userRepository.save(userId);
    }


}
