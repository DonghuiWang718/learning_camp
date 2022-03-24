package com.example.learning_camp.service;

import com.example.learning_camp.entity.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderListService {
    /**
     * 1、根据用户ID获取用户全部订单列表
     */
    public List<Order> getOrderByEU(int euId){

        return null;
    }
    /**
     * 2、根据用户ID获取用户待支付订单列表
     */
    public List<Order> getWaitPayOrderByEU(int euId){

        return null;
    }
    /**
     * 3、根据用户ID获取用户交易成功订单列表
     */
    public List<Order> getCompleteOrderByEU(int euId){

        return null;
    }
    /**
     * 4、根据用户ID获取用户交易关闭订单列表
     */
    public List<Order> getOverOrderByEU(int euId){

        return null;
    }
    /**
     * 5、添加订单
     */
    public boolean insertOrder(Order order){

        return true;
    }
}
