package com.example.learning_camp.service;

import com.example.learning_camp.entity.ExternalUser;
import org.springframework.stereotype.Service;

@Service
public class ExternalUserListService {
    /**
     * 1、根据用户ID获取用户信息
     */
    public ExternalUser getExternalUser(int euId){

        return null;
    }
    /**
     * 2、根据用户ID修改用户信息
     */
    public boolean editExternalUser(ExternalUser externalUser){

        return true;
    }
    /**
     * 3、添加用户
     */
    public boolean insertExternalUser(ExternalUser externalUser){

        return true;
    }
}
