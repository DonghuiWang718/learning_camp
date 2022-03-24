package com.example.learning_camp.service;

import com.example.learning_camp.entity.Dynamic;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DynamicListService {
    /**
     * 1、根据用户ID查询动态列表
     */
    public List<Dynamic> getDynamicList(int userId){

        return null;
    }
    /**
     * 2、添加动态
     */
    public boolean insertDynamic(Dynamic dynamic){

        return true;
    }
    /**
     * 3、删除动态
     */
    public boolean deleteDynamic(int dynamicId){

        return true;
    }
    /**
     * 4、根据用户ID查询用户发布动态
     */
    public List<Dynamic> getSelfDynamic(int userId){

        return null;
    }
}
