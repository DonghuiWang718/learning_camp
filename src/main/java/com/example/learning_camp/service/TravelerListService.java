package com.example.learning_camp.service;

import com.example.learning_camp.entity.Traveler;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelerListService {
    /**
     * 1、新增出行人员
     */
    public boolean insertTraveler(Traveler traveler){

        return true;
    }
    /**
     * 2、删除出行人员
     */
    public boolean deleteTraveler(int travelerId){

        return true;
    }
    /**
     * 3、根据用户ID查询出行人列表
     */
    public List<Traveler> getTravelersByEU(int euId){

        return null;
    }
}
