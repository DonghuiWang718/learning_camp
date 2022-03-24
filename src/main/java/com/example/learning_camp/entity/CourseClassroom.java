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
@TableName("course_classroom")
@ApiModel(value="CourseClassroom对象", description="")
public class CourseClassroom implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("cc_id")
    private Integer ccId;

    @TableField("course_id")
    private Integer courseId;

    @TableField("classroom_id")
    private Integer classroomId;


}
