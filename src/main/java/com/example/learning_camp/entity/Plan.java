package com.example.learning_camp.entity;

import java.time.LocalDate;
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
@ApiModel(value="Plan对象", description="")
public class Plan implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("plan_id")
    private Integer planId;

    @TableField("plan_name")
    private String planName;

    @TableField("item_id")
    private Integer itemId;

    private String duration;

    private LocalDate startdate;

    private LocalDate enddate;


}
