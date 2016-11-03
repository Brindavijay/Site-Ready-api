package com.icon.item.dao;

import com.icon.item.dto.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by A541351 on 10/23/2016.
 */
public interface ItemRepository extends MongoRepository<Item, String> {

    List<Item> findItemById(List<String> id);

    Item findItemById(String id);

}
