package com.example.learning_camp.controller;

import com.example.learning_camp.entity.SpecialColumn;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpecialColumnController {
    /**
     * 11028、入口：发现模块-研究性学习专栏的更多
     * 输入：	无
     * 输出：	学习专栏列表
     */
    public List<SpecialColumn> getSpecialColumnAll(){

        return null;
    }
    /** 11028、入口：发现模块-研究性学习专栏的详情
     * 输入：	研学专栏ID
     * 输出：	研学专栏详情
     */
    public List<SpecialColumn> getSpecialColumnDetail(int specialColumnId){

        return null;
    }
}
