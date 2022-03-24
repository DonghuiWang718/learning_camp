package com.example.learning_camp.service;

import com.example.learning_camp.entity.Item;
import com.example.learning_camp.entity.Plan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemListService {
    /**
     * 1、根据用户ID搜索购买购买正在进行的课程(项目）
     */
    public List<Item> getStartItemList(int EUId){

        return null;
    }
    /**
     * 2、根据用户ID搜索已经完成的课程
     */
    public List<Item> getOverItemList(int EUId){

        return null;
    }
    /**
     * 3、获取精选课程列表
     */
    public List<Item> getOverItemListByPriorityNumber(){

        return null;
    }
    /**
     * 4、根据课程类型、年级、城市查询实践课程
     */
    public List<Item> getOverItemListByConditions(int typeId,int gradeId,int cityId){

        return null;
    }
    /**
     * 5、根据关键字查询实践课程
     */
    public List<Item> getOverItemListByKeyword(String keyword){

        return null;
    }
    /**
     * 6、根据课程ID获取课程详情
     */
    public Item getItemDetail(int itemId){

        return null;
    }
    /**
     * 7、根据专栏ID获取课程列表
     */
    public List<Item> getItemListBySpecialColumn(int SCId){

        return null;
    }
    /**
     * 8、根据研学机构ID获取课程列表
     */
    public List<Item> getItemListByDept(int deptId){

        return null;
    }
}
