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
@TableName("main_sign")
@ApiModel(value="MainSign对象", description="")
public class MainSign implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ms_id")
    private Integer msId;

    @TableField("create_date")
    private LocalDateTime createDate;

    @TableField("over_date")
    private LocalDateTime overDate;

    @TableField("user_id")
    private Integer userId;

    @TableField("target_id")
    private Integer targetId;

    @TableField("sign_type")
    private Integer signType;


}
