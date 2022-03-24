package com.example.learning_camp.service;

import com.example.learning_camp.entity.Feedback;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackListService {
    /**
     * 1、根据用户ID获取用户意见反馈列表
     */
    public List<Feedback> getFeedbackByEU(int euId){

        return null;
    }
    /**
     * 2、添加用户意见反馈
     */
    public boolean insertFeedback(Feedback feedback){

        return true;
    }
    /**
     * 3、根据意见反馈ID删除意见反馈
     */
    public boolean deleteFeedback(int feedbackId){

        return true;
    }
    /**
     * 4、根据意见反馈ID获取意见详情
     */
    public Feedback getFeedbackDetail(int feedbackId){

        return null;
    }
    /**
     * 5、根据意见反馈ID修改意见反馈
     */
    public Feedback editFeedback(Feedback feedback){

        return null;
    }
}
