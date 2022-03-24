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
@ApiModel(value="Classroom对象", description="")
public class Classroom implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("classroom_id")
    private Integer classroomId;

    @TableField("classroom_name")
    private String classroomName;

    @TableField("classroom_capacity")
    private Integer classroomCapacity;

    @TableField("classroom_address")
    private String classroomAddress;


}
