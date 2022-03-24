package com.example.learning_camp.entity;

import java.math.BigDecimal;
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
@ApiModel(value="Item对象", description="")
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("item_id")
    private Integer itemId;

    @TableField("item_name")
    private String itemName;

    @TableField("item_duration")
    private Integer itemDuration;

    @TableField("item_content")
    private String itemContent;

    @TableField("item_price")
    private BigDecimal itemPrice;

    @TableField("item_img")
    private String itemImg;

    @TableField("item_url")
    private String itemUrl;

    @TableField("dept_id")
    private Integer deptId;

    @TableField("priority_number")
    private Integer priorityNumber;


}
