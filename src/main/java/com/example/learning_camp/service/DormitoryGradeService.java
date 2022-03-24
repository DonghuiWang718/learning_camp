package com.example.learning_camp.service;

import com.example.learning_camp.entity.Score;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DormitoryGradeService {
    /**
     * 1、查找学生宿舍成绩（学生查）
     */
    public Score getStudentDormitoryGrade(int studentId){

        return null;
    }
    /**
     * 2、查询某宿舍的学生成绩列表
     */
    public void getStudentAndGradeList(int dormitoryId){

    }
    /**
     * 3、修改某宿舍所有学生的成绩
     */
    public boolean EditStudentAndGradeList(List<Score> scores){

        return true;
    }
}
