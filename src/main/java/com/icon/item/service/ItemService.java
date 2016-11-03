package com.icon.item.service;

import com.icon.item.dto.BaseItem;
import com.icon.item.dto.Item;
import com.icon.item.enums.ItemSelectType;

import java.util.List;

/**
 * Created by A541351 on 10/23/2016.
 */
public interface ItemService {

    BaseItem findItem(String itemId, ItemSelectType itemSelectType);

    List<? extends BaseItem> findItems(List<String> itemIdList, ItemSelectType itemSelectType);

    void saveItem(List<Item> itemList);

    void updateItem(String itemId, Item item);

    void deleteItem(String itemId);
}
