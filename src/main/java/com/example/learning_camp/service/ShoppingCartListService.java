package com.example.learning_camp.service;

import com.example.learning_camp.entity.Item;
import com.example.learning_camp.entity.ShoppingCart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartListService {
    /**
     * 1、根据用户ID获取用户购物车中的课程列表
     */
    public List<Item> getItemList(int EUId){

        return null;
    }
    /**
     * 2、删除购物车中选课
     */
    public boolean deleteShoppingCart(int shoppingCartId){

        return true;
    }
    /**
     * 3、添加选课进入购物车
     */
    public boolean insertShoppingCart(ShoppingCart shoppingCart){

        return true;
    }
}
