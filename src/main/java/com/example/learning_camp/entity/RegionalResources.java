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
@TableName("regional_resources")
@ApiModel(value="RegionalResources对象", description="")
public class RegionalResources implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("rr_id")
    private Integer rrId;

    @TableField("rr_name")
    private String rrName;

    @TableField("rr_context")
    private String rrContext;

    @TableField("rr_img")
    private String rrImg;

    @TableField("area_id")
    private Integer areaId;


}
