package com.example.learning_camp.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
@TableName("travel_arrange")
@ApiModel(value="TravelArrange对象", description="")
public class TravelArrange implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ta_id")
    private Integer taId;

    @TableField("ca_id")
    private Integer caId;

    @TableField("car_id")
    private Integer carId;

    @TableField("ta_datetime")
    private LocalDateTime taDatetime;

    @TableField("driver_name")
    private String driverName;

    @TableField("driver_tel")
    private String driverTel;


}
