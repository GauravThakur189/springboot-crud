package net.javalearner.springboot_restful_api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class EmailAreadyExistSException extends  RuntimeException {

    private String message;


    public EmailAreadyExistSException(String message){
        super(message);
    }

}
