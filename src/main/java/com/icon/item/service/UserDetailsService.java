package com.icon.item.service;

import com.icon.item.dto.UserDetails;
import com.icon.item.exception.BadRequestException;
import com.icon.item.exception.LoginException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by A541351 on 11/18/2016.
 */

public interface UserDetailsService
{
    void signUp(UserDetails u);
    UserDetails signIn(String mailId,String password) throws LoginException,BadRequestException;

}
