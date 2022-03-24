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
@TableName("sign_in")
@ApiModel(value="SignIn对象", description="")
public class SignIn implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("si_id")
    private Integer siId;

    @TableField("user_id")
    private Integer userId;

    @TableField("ms_id")
    private Integer msId;

    @TableField("si_address")
    private String siAddress;

    private Double latitude;

    private Double longitude;

    private LocalDateTime date;


}
