package com.example.learning_camp.service;

import com.example.learning_camp.entity.Course;
import com.example.learning_camp.entity.SignIn;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViewStudentSesearchPlansService {
    /**
     * 1、查看学生课表
     */
    public List<Course> getStudentCourse(int studentId){

        return null;
    }
    /**
     * 2、查看学生小组
     */
    public void getStudentGroup(int studentId){


    }
    /**
     * 3、查看学生宿舍
     */
    public void getStudentDormitory(int studentId){

    }
    /**
     * 4、查看学生足迹
     */
    public List<SignIn> getStudentSignIn(int studentId){

        return null;
    }
    /**
     * 5、查看学生成绩
     */
    public void getStudentGrade(int studentId){

    }
}
