package com.example.learning_camp.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("external_user")
@ApiModel(value="ExternalUser对象", description="")
public class ExternalUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("external_user")
    private Integer externalUser;

    private String username;

    private String nickname;

    private String password;

    @TableField("avatar_path")
    private String avatarPath;

    private String sex;

    private Integer age;

    private String email;

    @TableField("current_student_id")
    private Integer currentStudentId;

    @TableField("role_type")
    private Integer roleType;


}
