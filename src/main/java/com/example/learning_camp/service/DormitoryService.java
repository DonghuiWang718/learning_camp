package com.example.learning_camp.service;

import com.example.learning_camp.entity.Dormitory;
import com.example.learning_camp.entity.User;
import org.springframework.stereotype.Service;

@Service
public class DormitoryService {
    /**
     * 1、查询某个学生的宿舍
     */
    public Dormitory getDormitoryByStudent(int studentId){

        return null;
    }
    /**
     * 2、获取学生宿舍信息及宿舍成绩
     */
    public void getDormitoryAndGrade(int studentId){

    }
    /**
     * 3、根据宿舍id获取宿舍详细信息
     */
    public void getDormitoryDetail(int dormitoryId){

    }
    /**
     * 5、查询宿舍导师
     */
    public User getDormitoryTeacher(int dormitoryId){

        return null;
    }
}
