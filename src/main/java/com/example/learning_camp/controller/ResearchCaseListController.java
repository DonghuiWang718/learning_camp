package com.example.learning_camp.controller;

import com.example.learning_camp.entity.Case;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ResearchCaseListController {
    /**
     * 11024、入口：发现模块-研学成果（研学案例）的第一个页面前置调用
     * 输入：	无
     * 输出：	研学案例列表
     * 11031、入口：发现模块-精选研学案例点击查看详情
     * 输入：	研学案例ID
     * 输出：	研学案例详情
     */
    public List<Case> getCaseAll(){

        return null;
    }
    /**
     * 11032、入口：发现模块-精选研学案例点击更多
     * 输入：	无
     * 输出：	研学案例列表
     */
    public List<Case> getCaseDetail(int caseId){

        return null;
    }
}
