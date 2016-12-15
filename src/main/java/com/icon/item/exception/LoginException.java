package com.icon.item.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by A541351 on 11/20/2016.
 */
@ResponseStatus(value = HttpStatus.UNAUTHORIZED
public class LoginException extends Exception {

    public LoginException(String message){
        super(message);
    }
}
