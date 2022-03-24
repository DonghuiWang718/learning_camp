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
@TableName("plan_course")
@ApiModel(value="PlanCourse对象", description="")
public class PlanCourse implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("pc_id")
    private Integer pcId;

    @TableField("plan_id")
    private Integer planId;

    @TableField("course_name")
    private String courseName;

    @TableField("course_content")
    private String courseContent;

    @TableField("course_duration")
    private Integer courseDuration;


}
