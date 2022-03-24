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
@ApiModel(value="Traveler对象", description="")
public class Traveler implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("traveler_id")
    private Integer travelerId;

    @TableField("traveler_name")
    private String travelerName;

    @TableField("traveler_ID_num")
    private String travelerIdNum;

    @TableField("traveler_tel")
    private String travelerTel;

    @TableField("eu_id")
    private Integer euId;


}
