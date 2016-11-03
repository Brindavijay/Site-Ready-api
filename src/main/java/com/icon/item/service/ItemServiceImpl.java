package com.icon.item.service;

import com.icon.item.dao.ItemRepository;
import com.icon.item.dto.BaseItem;
import com.icon.item.dto.CompactItem;
import com.icon.item.dto.Item;
import com.icon.item.enums.ItemSelectType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by A541351 on 10/23/2016.
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public void deleteItem(String itemId) {
        itemRepository.delete(itemId);
    }

    @Override
    public BaseItem findItem(String itemId, ItemSelectType itemSelectType) {

        Item item = itemRepository.findItemById(itemId);

        BaseItem itemObj = null;
        if(itemSelectType == ItemSelectType.COMPACT){
            itemObj = new CompactItem();
            itemObj.setId(item.getId());
            itemObj.setImagePath(item.getImagePath());
            itemObj.setShortDesc(item.getShortDesc());
            return itemObj;
        }

        return item;
    }

    @Override
    public List<? extends BaseItem> findItems(List<String> itemIdList, ItemSelectType itemSelectType) {
        List<Item> itemList = itemRepository.findItemById(itemIdList);
        return itemList;
    }

    @Override
    public void saveItem(List<Item> itemList) {
        itemRepository.save(itemList);
    }

    public void updateItem( String itemId, Item item){
        Item itemObj = itemRepository.findOne(itemId);

        if(item.getLabelInfo() != null){
            itemObj.setLabelInfo(item.getLabelInfo());
        }

        itemRepository.save(itemObj);
    }
}
