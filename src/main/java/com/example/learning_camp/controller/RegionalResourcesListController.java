package com.example.learning_camp.controller;

import com.example.learning_camp.entity.RegionalResources;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegionalResourcesListController {

    /**
     * 11023、入口：发现模块-地区资源的第一个页面前置调用
     * 输入：	无
     * 输出：	地区资源列表
     */
    public List<RegionalResources> getRegionalResources(){

        return null;
    }

    /**
     * 11040、入口：发现模块-地区资源的详情
     * 输入：	地区资源ID
     * 输出：	地区资源详情
     */
    public RegionalResources getRegionalResourcesDetail(int regionalResourcesId){

        return null;
    }

}
