package com.example.learning_camp.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author donghui
 * @since 2022-03-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="User对象", description="")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("user_id")
    private Integer userId;

    private String username;

    private String nickname;

    private String password;

    @TableField("avatar_path")
    private String avatarPath;

    @TableField("gr_code")
    private String grCode;

    @TableField("invite_code")
    private String inviteCode;

    private String name;

    private String sex;

    private Integer age;

    private String tel;

    private String email;

    private String unit;

    @TableField("plan_id")
    private Integer planId;

    @TableField("dept_id")
    private Integer deptId;

    @TableField("dormitory_id")
    private Integer dormitoryId;

    @TableField("group_id")
    private Integer groupId;

    @TableField("leader_user_id")
    private Integer leaderUserId;


}
