package com.example.learning_camp.controller;

import com.example.learning_camp.entity.Order;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemScoreListController {
    /**
     * 11010、入口：我的模块-我的评论的详情页面
     * 输入：	用户ID
     * 输出：	评论列表
     * @param orderId
     * @return
     */
    public Order getItemScore(int orderId){

        return null;
    }

    /**
     * 11036、入口：我的模块-我的评论的详情页面的保存和修改按钮
     * 输入：	评论信息
     * 输出：	布尔值
     * @param order
     * @return
     */
    public boolean editItemScore(Order order){

        return true;
    }
}
