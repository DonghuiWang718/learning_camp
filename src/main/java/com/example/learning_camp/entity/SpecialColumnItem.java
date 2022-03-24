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
@TableName("special_column_item")
@ApiModel(value="SpecialColumnItem对象", description="")
public class SpecialColumnItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("sci_id")
    private Integer sciId;

    @TableField("sc_id")
    private Integer scId;

    @TableField("item_id")
    private Integer itemId;


}
