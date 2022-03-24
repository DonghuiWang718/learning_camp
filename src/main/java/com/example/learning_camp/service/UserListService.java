package com.example.learning_camp.service;

import com.example.learning_camp.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserListService {
    /**
     * 1、获得老师的数据权限
     */

    /**
     * 2、修改用户信息
     */
    public boolean editUserInfo(User user){

        return true;
    }
    /**
     * 3、验证密码正确性
     */
    public boolean isCodeRight(User user){

        return true;
    }
    /**
     * 4、修改用户密码
     */
    public boolean editPassword(User user){

        return true;
    }
    /**
     * 5、查询手机号是否被注册
     */
    public boolean isTelExist(String tel){
        return true;
    }
    /**
     * 6、根据用户账号查询用户简要信息（姓名、电话）
     */
    public User getUserInfo(int userId){

        return null;
    }
    /**
     * 7、根据用户账号查询用户详细信息（头像、姓名、电话、年龄、邮箱、性别（用户账号，即ID号为参数））
     */
    public User getUserDetailInfo(int userId){

        return null;
    }
    /**
     * 8、根据用户账户和旧密码修改密码
     */
    public boolean EditPassword(User user,String newPassword){
        return true;
    }
    /**
     * 9、获取管理员数据权限
     */
}
