package com.example.learning_camp.controller;

import com.example.learning_camp.entity.Feedback;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeedbackListController {
    /**
     * 11012、入口：我的模块-意见反馈的第一个页面的前置调用
     * 输入：	外部用户ID
     * 输出：	意见反馈列表
     * @param euId
     * @return
     */
    public List<Feedback> getFeedbackByEU(int euId){

        return null;
    }

    /**
     * 11013、入口：我的模块-意见反馈的意见提交按钮
     * 输入：	意见反馈信息
     * 输出：	布尔值
     * @param feedback
     * @return
     */
    public boolean insertFeedback(Feedback feedback){

        return true;
    }

    /**
     * 11038、入口：我的模块-查看意见反馈详情的撤销反馈按钮
     * 输入：	意见反馈ID
     * 输出：	布尔值
     * @param feedbackId
     * @return
     */
    public boolean deleteFeedback(int feedbackId){

        return true;
    }

    /**
     * 11037、入口：我的模块-查看意见反馈详情的前置调用
     * 输入：	意见反馈ID
     * 输出：	意见反馈详情
     * @param feedbackId
     * @return
     */
    public Feedback getFeedbackDetail(int feedbackId){

        return null;
    }

    /**
     * 11036、入口：我的模块-我的评论的详情页面的保存和修改按钮
     * 输入：	意见反馈信息
     * 输出：	布尔值
     * @param feedback
     * @return
     */
    public Feedback editFeedback(Feedback feedback){

        return null;
    }
}
