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
@ApiModel(value="Feedback对象", description="")
public class Feedback implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("feedback_id")
    private Integer feedbackId;

    @TableField("eu_id")
    private Integer euId;

    @TableField("opinion_type")
    private String opinionType;

    private String nect;

    private String tel;

    @TableField("img_path")
    private String imgPath;


}
