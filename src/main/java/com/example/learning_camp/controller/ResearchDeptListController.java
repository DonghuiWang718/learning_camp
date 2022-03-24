package com.example.learning_camp.controller;

import com.example.learning_camp.entity.Dept;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ResearchDeptListController {
    /**
     * 11026、入口：发现模块-地区研学机构的更多
     * 输入：	无
     * 输出：	研学机构列表
     * 11025、入口：发现模块-地区研学机构的点击地区图片搜索研学机构
     * 输入：	地区ID
     * 输出：	研学机构列表
     */
    public List<Dept> getDeptByArea(int areaId){

        return null;
    }
    /**
     * 11033、入口：发现模块-地区研学机构点击查看机构详情
     * 输入：	研学机构ID
     * 输出：	研学机构详情
     */
    public Dept getDeptDetail(int deptId){

        return null;
    }
}
