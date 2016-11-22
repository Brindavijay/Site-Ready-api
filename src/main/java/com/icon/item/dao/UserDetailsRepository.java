package com.icon.item.dao;

import com.icon.item.dto.UserDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by A541351 on 11/18/2016.
 */
public interface UserDetailsRepository extends MongoRepository<UserDetails,String>
{
   UserDetails findByMailIdAndPassword(String mailId,String password);
}
