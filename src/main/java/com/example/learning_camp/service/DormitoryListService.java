package com.example.learning_camp.service;

import com.example.learning_camp.entity.Dormitory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DormitoryListService {
    /**
     * 1、生活导师获取正在进行研学计划的宿舍列表
     */
    public List<Dormitory> getDormitoryByTeacher(int teacherId){

        return null;
    }
    /**
     * 2、根据宿舍id查询宿舍详细信息
     */
    public void getDormitoryDetail(int dormitoryId){


    }
    /**
     * 3、营地管理员获取正在进行研学计划的宿舍列表
     */
    public List<Dormitory> getDormitoryByAdmin(int adminId){

        return null;
    }
}
