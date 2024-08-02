package net.javalearner.springboot_restful_api.controller.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;

    @NotEmpty(message = "user name should not be null or empty")
    private String firstName;

    @NotEmpty(message = "user last name should not be empty ")
    private String lastName;

    @NotEmpty(message = "user email should not be empty")
    @Email(message = "user email should be valid")
    private String emailId;
}
