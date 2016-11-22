package com.icon.item.controller;

import com.icon.item.dto.UserDetails;
import com.icon.item.exception.LoginException;
import com.icon.item.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by A541351 on 11/18/2016.
 */
@RestController
public class UserDetailsController
{
    @Autowired
    private UserDetailsService userDetailsService;


    @RequestMapping(path="/signUp",method= RequestMethod.POST)
    public  void signUp(@RequestBody UserDetails userDetails)
    {
        userDetailsService.signUp(userDetails);
    }
    @RequestMapping(path="/signIn",method= RequestMethod.POST)
    public UserDetails signIn(@RequestBody UserDetails userDetails) throws LoginException
    {
        return userDetailsService.signIn(userDetails.getMailId(), userDetails.getPassword());

    }


}
