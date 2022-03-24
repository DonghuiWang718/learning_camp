package com.example.learning_camp.service;

import com.example.learning_camp.entity.Score;
import org.springframework.stereotype.Service;

@Service
public class DormitoryScoringService {
    /**
     * 1、添加宿舍评分
     */
    public boolean insertDormitoryScore(Score score){

        return true;
    }
    /**
     * 2、通过学生id和宿舍id查看宿舍评分
     */
    public Score getDormitoryScore(int studentId,int dormitoryId){

        return null;
    }
}
