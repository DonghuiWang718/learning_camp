package com.example.learning_camp.service;

import com.example.learning_camp.entity.Score;
import org.springframework.stereotype.Service;

@Service
public class CourseScoringService {
    /**
     * 1、添加课程评分
     */
    public boolean insertCourseScore(Score score){

        return true;
    }
    /**
     * 2、通过学生id和课程id查看课程评分
     */
    public Score getCourseScore(int studentId, int courseId){

        return null;
    }
}
