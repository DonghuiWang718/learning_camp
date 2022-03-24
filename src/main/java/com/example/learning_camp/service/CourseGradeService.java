package com.example.learning_camp.service;

import com.example.learning_camp.entity.Course;
import com.example.learning_camp.entity.Score;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseGradeService {
    /**
     * 1、查找学生课程成绩（学生查）
     */
    public List<Score> getCourseGradeByStudent(List<Course>  courseList,int studentId){

        return null;
    }
    /**
     * 2、查询某课程的学生成绩列表
     */
    public void getStudentCourseGradeByCourse(int courseId){


    }
    /**
     * 3、修改某课程所有学生的成绩
     */
    public boolean editStudentCourseGradebyCourse(List<Score> studentCourseGradeList){

        return true;
    }
}
