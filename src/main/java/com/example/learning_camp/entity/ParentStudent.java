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
@TableName("parent_student")
@ApiModel(value="ParentStudent对象", description="")
public class ParentStudent implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ps_id")
    private Integer psId;

    @TableField("eu_id")
    private Integer euId;

    @TableField("user_id")
    private Integer userId;


}
