package com.example.learning_camp.service;

import com.example.learning_camp.entity.Score;
import org.springframework.stereotype.Service;

@Service
public class TeacherScoringService {
    /**
     * 1、添加导师评分
     */
    public boolean insertTeacherScore(Score score){

        return true;
    }
    /**
     * 2、通过学生id和导师id查看导师评分
     */
    public Score getTeacherScore(int studentId,int teacherId){

        return null;
    }
}
