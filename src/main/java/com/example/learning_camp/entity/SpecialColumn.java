package com.example.learning_camp.entity;

import java.math.BigDecimal;
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
@TableName("special_column")
@ApiModel(value="SpecialColumn对象", description="")
public class SpecialColumn implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("sc_id")
    private Integer scId;

    @TableField("sc_num")
    private Integer scNum;

    @TableField("sc_title")
    private String scTitle;

    @TableField("sc_price")
    private BigDecimal scPrice;

    @TableField("sc_img")
    private String scImg;

    @TableField("sc_url")
    private String scUrl;

    @TableField("dept_id")
    private Integer deptId;

    @TableField("sc_context")
    private String scContext;

    @TableField("priority_number")
    private Integer priorityNumber;


}
