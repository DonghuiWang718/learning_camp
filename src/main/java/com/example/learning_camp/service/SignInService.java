package com.example.learning_camp.service;

import com.example.learning_camp.entity.SignIn;
import org.springframework.stereotype.Service;

@Service
public class SignInService {
    /**
     * 1、获取学生签到信息
     */
    public SignIn getStudnetSignIn(int studentId){

        return null;
    }
    /**
     * 2、修改学生签到状态
     */
    public boolean editStudentSignIn(SignIn signIn){

        return true;
    }
    /**
     * 3、添加签到信息
     */
    public boolean insertStudentSignIn(SignIn signIn){

        return true;
    }
}
