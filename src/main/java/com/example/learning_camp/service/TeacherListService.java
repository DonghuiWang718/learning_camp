package com.example.learning_camp.service;

import com.example.learning_camp.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherListService {
    /**
     * 1、根据营地管理员ID获取课程导师列表
     */
    public List<User> getCourseTeacherByAdmin(int adminId){

        return null;
    }
    /**
     * 2、根据营地管理员ID获取生活导师列表
     */
    public List<User> getDailyTeacherByAdmin(int adminId){

        return null;
    }
}
