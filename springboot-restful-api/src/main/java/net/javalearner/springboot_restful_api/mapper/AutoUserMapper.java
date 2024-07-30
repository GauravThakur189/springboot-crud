package net.javalearner.springboot_restful_api.mapper;

import net.javalearner.springboot_restful_api.controller.dto.UserDto;
import net.javalearner.springboot_restful_api.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoUserMapper {


    AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class);

    UserDto mapToUserDto(User user);

    User mapToUser(UserDto userDto);
}
