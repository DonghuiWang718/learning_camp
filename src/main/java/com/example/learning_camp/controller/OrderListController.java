package com.example.learning_camp.controller;

import com.example.learning_camp.entity.Order;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderListController {
    /**
     * 11006、入口：我的模块-我的订单的第一个页面的前置调用
     * 输入：	外部用户ID
     * 输出：	订单列表
     * @param euId
     * @return
     */
    public List<Order> getOrderByEU(int euId){

        return null;
    }

    /**
     * 11007、入口：我的模块-我的订单的待支付页面的前置调用
     * 输入：	外部用户ID
     * 输出：	订单列表
     * @param euId
     * @return
     */
    public List<Order> getWaitPayOrderByEU(int euId){

        return null;
    }

    /**
     * 11008、入口：我的模块-我的订单的交易成功页面的前置调用
     * 输入：	外部用户ID
     * 输出：	订单列表
     * @param euId
     * @return
     */
    public List<Order> getCompleteOrderByEU(int euId){

        return null;
    }

    /**
     * 11009、入口：我的模块-我的订单的交易关闭页面的前置调用
     * 输入：	外部用户ID
     * 输出：	订单列表
     * @param euId
     * @return
     */
    public List<Order> getOverOrderByEU(int euId){

        return null;
    }

    /**
     * 11015、入口：选课模块-结算页面的立即购买按钮
     * 输入：	订单信息、出行人列表
     * 输出：	结果
     * @param order
     * @return
     */
    public boolean insertOrder(Order order){

        return true;
    }
}
