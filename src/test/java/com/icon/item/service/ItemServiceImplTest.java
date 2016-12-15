package com.icon.item.service;

import com.icon.item.dao.ItemRepository;
import com.icon.item.dto.BaseItem;
import com.icon.item.dto.Item;
import org.junit.Before;
import org.junit.Test;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * Created by A541351 on 12/7/2016.
 */
public class ItemServiceImplTest {

    private ItemServiceImpl itemServiceObj;

    @Before
    public void setUp(){
        itemServiceObj = new ItemServiceImpl();
    }

    @Test
    public void testIsValidateItemIdByPassingInvalidItemId(){
        boolean expectedResult = itemServiceObj.isvalidateItemId("");
        org.junit.Assert.assertFalse(expectedResult);
    }

    @Test
    public void testIsValidateItemIdByPassingInvalidItemIdThatStartesWithB(){
        boolean expectedResult = itemServiceObj.isvalidateItemId("B14567");
        org.junit.Assert.assertFalse(expectedResult);
    }

    @Test
    public void testIsValidateItemIdByPassingValidItemId(){
        boolean expectedResult = itemServiceObj.isvalidateItemId("A14567");
        org.junit.Assert.assertTrue(expectedResult);
    }


}

