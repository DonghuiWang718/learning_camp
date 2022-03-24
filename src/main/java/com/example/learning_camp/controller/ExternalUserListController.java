package com.example.learning_camp.controller;

import com.example.learning_camp.entity.ExternalUser;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExternalUserListController {
    /**
     * 11001、入口：我的模块-前置调用
     * 输入：	用户ID
     * 输出：	用户详情
     * @param euId
     * @return
     */
    public ExternalUser getExternalUser(int euId){

        return null;
    }

    /**
     * 11003、入口：我的模块-修改个人信息的保存按钮
     * 输入：	用户信息
     * 输出：	布尔值
     * @param externalUser
     * @return
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
