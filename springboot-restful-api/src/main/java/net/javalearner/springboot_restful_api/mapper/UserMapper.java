package net.javalearner.springboot_restful_api.mapper;

import net.javalearner.springboot_restful_api.controller.dto.UserDto;
import net.javalearner.springboot_restful_api.entity.User;

public class UserMapper {

    public static UserDto mapToUserDto(User user){
        //converting user entity to userDto
        UserDto userDto = new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmailId()
        );
        return userDto;
    }

    public static User mapToUser(UserDto userDto){
        // converting userDto to user entity
        User user = new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmailId()
        );
        return user;
    }
}
