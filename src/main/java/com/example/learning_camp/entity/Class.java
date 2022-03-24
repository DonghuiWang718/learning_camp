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
@ApiModel(value="Class对象", description="")
public class Class implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("class_id")
    private Integer classId;

    @TableField("plan_id")
    private Integer planId;

    @TableField("class_name")
    private String className;

    @TableField("class_amount")
    private Integer classAmount;

    @TableField("class_capacity")
    private Integer classCapacity;


}
