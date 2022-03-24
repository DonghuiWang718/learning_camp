package com.example.learning_camp.entity;

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
@ApiModel(value="Dynamic对象", description="")
public class Dynamic implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer dynamic;

    @TableField("plan_id")
    private Integer planId;

    @TableField("user_id")
    private Integer userId;

    private String content;

    private LocalDateTime date;

    @TableField("img_path")
    private String imgPath;


}
