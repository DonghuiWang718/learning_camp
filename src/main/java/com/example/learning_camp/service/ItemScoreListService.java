package com.example.learning_camp.service;

import com.example.learning_camp.entity.Order;
import org.springframework.stereotype.Service;

@Service
public class ItemScoreListService {
    /**
     * 1、根据订单(用户ID和课程)获取用户评论
     */
    public Order getItemScore(int orderId){

        return null;
    }
    /**
     * 2、修改、添加评论
     */
    public boolean editItemScore(Order order){

        return true;
    }
}
