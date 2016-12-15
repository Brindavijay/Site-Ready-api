package com.icon.item.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by A541351 on 11/30/2016.
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends  Exception {

    public BadRequestException(String fieldName, String message){
        super(fieldName + message);
    }
}
