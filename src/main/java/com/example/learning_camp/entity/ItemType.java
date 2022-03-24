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
@TableName("item_type")
@ApiModel(value="ItemType对象", description="")
public class ItemType implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("it_id")
    private Integer itId;

    @TableField("it_name")
    private String itName;

    @TableField("it_parent")
    private Integer itParent;


}
