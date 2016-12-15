package com.icon.item.controller;

import com.icon.item.dto.BaseItem;
import com.icon.item.dto.Item;
import com.icon.item.enums.ItemSelectType;
import com.icon.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SiteReadyController {

    @Autowired
    @Qualifier("itemService")
    private ItemService itemService;

    @RequestMapping("/getItem")
    public BaseItem getItem(@RequestParam(value="itemId") String itemId, @RequestParam(value="selectType") String selectType) {

        return itemService.findItem(itemId, ItemSelectType.valueOf(selectType));
    }

    @RequestMapping(method= RequestMethod.POST, path = "/createItem")
    public void create(@RequestBody List<Item> itemList) {

        itemService.saveItem(itemList);
    }

    @RequestMapping(method= RequestMethod.PUT, path = "/updateItem/{itemId}")
    public void create(@PathVariable("itemId") String itemId, @RequestBody Item item) {

        itemService.updateItem(itemId, item);
    }


    @RequestMapping(method= RequestMethod.DELETE, path = "/deleteItem/{itemId}")
    public void delete(@PathVariable("itemId") String itemId) {

        itemService.deleteItem(itemId);
    }


}
