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
@TableName("item_course")
@ApiModel(value="ItemCourse对象", description="")
public class ItemCourse implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ic_id")
    private Integer icId;

    @TableField("course_id")
    private Integer courseId;

    @TableField("item_id")
    private Integer itemId;


}
