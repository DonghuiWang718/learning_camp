package com.example.learning_camp.service;

import com.example.learning_camp.entity.Score;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseListService {
    /**
     * 1、获取学生课程列表
     */
//    public List<CourseArrange> getCourseByStudent(){
//
//    }
    /**
     * 2、获取学生课程列表及其成绩
     */
    public void getStudentCourseAndGradeByStudent(int studentId){
        //查询学生课程列表

        //查学生成绩

    }
    /**
     * 3、查看课程导师排课表
     */
//    public List<CourseArrange> getCourseByTeacher(){
//
//    }
    /**
     * 4、获取正在进行研学计划的课程列表
     */
//    public List<CourseArrange> getCourseByTeacherAndPlan(){
//
//    }
    /**
     * 5、根据课程列表获取学生对课程导师列表及其评分
     */
    public void getTeacherAndScoreByCourseAndStudent(int studentId){
        //获取学生课程列表

        //查询评分

    }
    /**
     * 6、获取学生课程列表及其评分
     */
    public void getCourseAndScoreByStudent(int studentId){

    }
    /**
     * 7、营地管理员获取正在进行研学计划的课程列表
     */
    public void getCourseListByAdmin(int adminId){

    }
    /**
     * 8、获取课程详情 (课程老师、课程详情、出行方式）
     */
    public void getCourseDetail(int courseId){

    }
}
