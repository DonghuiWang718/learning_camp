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
@TableName("traveler_arrange")
@ApiModel(value="TravelerArrange对象", description="")
public class TravelerArrange implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("traa_id")
    private Integer traaId;

    @TableField("traveler_id")
    private Integer travelerId;

    @TableField("order_id")
    private Integer orderId;

    @TableField("user_id")
    private Integer userId;


}
