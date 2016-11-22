package com.icon.item.service;

import com.icon.item.dao.UserDetailsRepository;
import com.icon.item.dto.UserDetails;
import com.icon.item.exception.LoginException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by A541351 on 11/18/2016.
 */
@Service
public class UserDetailServiceImpl implements UserDetailsService
{
    @Autowired
    private UserDetailsRepository userDetailsRepository;

    @Override
     public void signUp(UserDetails u)
     {
        userDetailsRepository.save(u);
     }

    @Override
    public UserDetails signIn(String mailId, String password) throws LoginException
    {
        UserDetails u=userDetailsRepository.findByMailIdAndPassword(mailId,password);
        if(u==null){
            throw new LoginException("Invalid email and password");
        }

        return u;
    }

   /* @Override
    public boolean signIn(String emailId)
    {
        if(emailId.)
        return false;
    }*/

}
