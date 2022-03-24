package com.example.learning_camp.controller;

import com.example.learning_camp.entity.Item;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemListController {
    /**
     * 11004、入口：我的模块-已购课程的第一个页面的前置调用
     * 输入：	外部用户ID
     * 输出：	已经购买的项目的列表
     * @param EUId
     * @return
     */
    public List<Item> getStartItemList(int EUId){

        return null;
    }

    /**
     * 11005、入口：我的模块-已购课程的已学课程页面的前置调用
     * 11010、入口：我的模块-我的评论的第一个页面的前置调用
     * 输入：	外部用户ID
     * 输出：	已学完的项目课程列表
     * @param EUId
     * @return
     */
    public List<Item> getOverItemList(int EUId){

        return null;
    }

    /**
     * 11017、入口：实践课程模块-前置调用
     * 11030、入口：发现模块-精选实践课程点击更多
     * 输入：	无
     * 输出：	项目列表
     * @return
     */
    public List<Item> getOverItemListByPriorityNumber(){

        return null;
    }

    /**
     * 11018、入口：实践课程模块-按条件查询实践课程
     * 输入：	年级、类别、地区
     * 输出：	项目列表
     * @param typeId
     * @param gradeId
     * @param cityId
     * @return
     */
    public List<Item> getOverItemListByConditions(int typeId,int gradeId,int cityId){

        return null;
    }

    /**
     * 11019、入口：实践课程模块-按关键字查询实践课程
     * 输入：	关键字
     * 输出：	项目列表
     * @param keyword
     * @return
     */
    public List<Item> getOverItemListByKeyword(String keyword){

        return null;
    }

    /**
     * 11020、入口：实践课程模块-点击课程查看详情
     * 11029、入口：发现模块-精选实践课程
     * 输入：	项目ID
     * 输出：	项目详情
     * @param itemId
     * @return
     */
    public Item getItemDetail(int itemId){

        return null;
    }

    /**
     * 11039、入口：研学专栏页面的课程目录按钮
     * 输入：	专栏ID
     * 输出：	项目列表
     * @param SCId
     * @return
     */
    public List<Item> getItemListBySpecialColumn(int SCId){

        return null;
    }
}
