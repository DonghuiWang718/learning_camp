package com.example.learning_camp.service;

import com.example.learning_camp.entity.Case;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResearchCaseListService {
    /**
     * 1、获取精选研学档案列表
     */
    public List<Case> getCaseByPriorityNumber(){

        return null;
    }
    /**
     * 2、获取所有研学档案列表
     */
    public List<Case> getCaseAll(){

        return null;
    }
    /**
     * 3、根据研学档案ID获取研学档案详情
     */
    public List<Case> getCaseDetail(int caseId){

        return null;
    }
    /**
     * 4、根据研学机构ID获取研学档案列表
     */
    public List<Case> getCaseByDept(int deptId){

        return null;
    }
}
