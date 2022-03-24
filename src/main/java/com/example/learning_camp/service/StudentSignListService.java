package com.example.learning_camp.service;

import com.example.learning_camp.entity.SignIn;
import org.springframework.stereotype.Service;

@Service
public class StudentSignListService {
    /**
     * 1、查询该课程的学生签到情况
     */
    public void getCourseSignIn(int CourseId){


    }
    /**
     * 2、修改某学生签到状态
     */
    public boolean editSignIn(SignIn signIn){

        return true;
    }
    /**
     * 3、查询该宿舍的学生签到情况
     */
    public void getDormitorySignIn(int dormitoryId){


    }
}
