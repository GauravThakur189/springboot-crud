package net.javalearner.springboot_restful_api.services.impl;

import lombok.AllArgsConstructor;
import net.javalearner.springboot_restful_api.controller.dto.UserDto;
import net.javalearner.springboot_restful_api.entity.User;
import net.javalearner.springboot_restful_api.exception.ResourceNotFoundException;
import net.javalearner.springboot_restful_api.mapper.AutoUserMapper;
import net.javalearner.springboot_restful_api.mapper.UserMapper;
import net.javalearner.springboot_restful_api.repository.UserRepository;
import net.javalearner.springboot_restful_api.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {



    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

//    @Override
//    public User createService(User user) {
//        return userRepository.save(user);
//    }

    @Override
    public UserDto createService(UserDto userDto) {
        //convert UserDto into user JPA Entity
//        User user = UserMapper.mapToUser(userDto);
      //  User user = modelMapper.map(userDto,User.class);
        User user = AutoUserMapper.MAPPER.mapToUser(userDto);
        User savedUser =  userRepository.save(user);

        // convert User jpa entity to UserDto

//        UserDto savedUserDto = UserMapper.mapToUserDto(savedUser);
       // UserDto savedUserDto = modelMapper.map(savedUser,UserDto.class);
        UserDto savedUserDto = AutoUserMapper.MAPPER.mapToUserDto(savedUser);
        return  savedUserDto;
    }

    @Override
    public UserDto getUserById(Long userId) {
        User user =  userRepository.findById(userId).orElseThrow(
                ()-> new ResourceNotFoundException("User","id",userId)
        );
       // User user =  optionalUser.get();
       // return UserMapper.mapToUserDto(user);
       // return modelMapper.map(user,UserDto.class);
        return AutoUserMapper.MAPPER.mapToUserDto(user);
    }

    @Override
    public List<UserDto> getAllUser() {
        List<User> userList =  userRepository.findAll();

//        return userList.stream().map((user)-> modelMapper.map(user,UserDto.class))
//                .collect(Collectors.toList());

        return userList.stream().map((user)->AutoUserMapper.MAPPER.mapToUserDto(user))
                .collect(Collectors.toList());

    }

    @Override
    public UserDto updateUser(UserDto user) {
        User userId   = userRepository.findById(user.getId()).orElseThrow(
                ()-> new ResourceNotFoundException("User","id",user.getId())
        );
        userId.setFirstName(user.getFirstName());
        userId.setLastName(user.getLastName());
      User updateUser =  userRepository.save(userId);
      //return UserMapper.mapToUserDto(updateUser);
       // return modelMapper.map(updateUser,UserDto.class);
        return AutoUserMapper.MAPPER.mapToUserDto(updateUser);
    }


}
