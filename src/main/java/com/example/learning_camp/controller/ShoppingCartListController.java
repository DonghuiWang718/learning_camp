package com.example.learning_camp.controller;

import com.example.learning_camp.entity.Item;
import com.example.learning_camp.entity.ShoppingCart;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShoppingCartListController {
    /**
     * 11014、入口：选课模块-前置调用
     * 输入：	外部用户ID
     * 输出：	选课项目列表
     * @param EUId
     * @return
     */
    public List<Item> getItemList(int EUId){

        return null;
    }

    /**
     * 11016、入口：选课模块-清空按钮
     * 输入：	项目ID列表
     * 输出：	返回布尔值
     * @param shoppingCartId
     * @return
     */
    public boolean deleteShoppingCart(int shoppingCartId){

        return true;
    }

    /**
     * 11034、入口：查看课程详情-加入选课按钮
     * 输入：	项目ID、外部用户ID
     * 输出：	返回布尔值
     * @param shoppingCart
     * @return
     */
    public boolean insertShoppingCart(ShoppingCart shoppingCart){

        return true;
    }
}
