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
@ApiModel(value="Dormitory对象", description="")
public class Dormitory implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("dormitory_id")
    private Integer dormitoryId;

    @TableField("dormitory_name")
    private String dormitoryName;

    @TableField("dormitory_type")
    private String dormitoryType;

    @TableField("dormitory_amount")
    private Integer dormitoryAmount;

    @TableField("dormitory_capacity")
    private Integer dormitoryCapacity;

    @TableField("user_id")
    private Integer userId;

    @TableField("dormitory_address")
    private String dormitoryAddress;


}
