package com.example.learning_camp.service;

import org.springframework.stereotype.Service;

@Service
public class StudentListService {
    /**
     * 1、查询学生列表（参数：领队老师id）
     */
    //public List<User> getStudentsByLeader();

    /**
     * 2、根据学生id查询学生详细信息
     */
    //public User getStudentByID();
    /**
     * 3、查询学生列表（参数：课程id）
     */
    //public List<User> getStudentsByCourse();
    /**
     * 4、查询学生列表（参数：宿舍id）
     */
    //public List<User> getStudentsByDormitory();
    /**
     * 5、查询家长关联的学生的列表（参数：家长id）
     */
    //public List<User> getStudentsByParent();
    /**
     * 6、根据邀请码查询学生
     */
    //public User getStudentByCode();
    /**
     * 7、变更当前关联学生
     */
    public boolean editParentStudent(){

        return true;
    }
    /**
     * 8、删除关联学生
     */
    public boolean deleteParentStudent(){

        return true;
    }
    /**
     * 9、查询学生列表（参数：营地管理员ID）
     */
    //public List<User> getStudentsByAdmin();
    /**
     * 10、根据学生id查询学生邀请码
     */
    public String getCodeByStudent(){

        return null;
    }

    /**
     * 11、查询并验证邀请码和学生姓名的正确性
     */
    public boolean checkStudentCode(){

        return true;
    }
}
