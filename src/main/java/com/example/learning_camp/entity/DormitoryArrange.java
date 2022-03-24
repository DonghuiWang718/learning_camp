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
@TableName("dormitory_arrange")
@ApiModel(value="DormitoryArrange对象", description="")
public class DormitoryArrange implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("da_id")
    private Integer daId;

    @TableField("dormitory_id")
    private Integer dormitoryId;

    @TableField("user_id")
    private Integer userId;

    @TableField("da_grade")
    private Float daGrade;

    @TableField("da_score")
    private Float daScore;


}
