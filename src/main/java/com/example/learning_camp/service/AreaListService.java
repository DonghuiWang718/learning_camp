package com.example.learning_camp.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.learning_camp.entity.Area;
import com.example.learning_camp.mapper.AreaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaListService {

    @Autowired
    private AreaMapper areaMapper;
    /**
     * 1、获取地区列表
     */
    public List<Area> getAreaList(){
        return areaMapper.selectList(new QueryWrapper<>());
    }
}
