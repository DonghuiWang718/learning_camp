package com.example.learning_camp.entity;

import java.math.BigDecimal;
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
@ApiModel(value="Order对象", description="")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("order_id")
    private Integer orderId;

    private BigDecimal price;

    private Integer num;

    @TableField("total_price")
    private BigDecimal totalPrice;

    @TableField("actual_payment")
    private BigDecimal actualPayment;

    @TableField("item_id")
    private Integer itemId;

    @TableField("eu_id")
    private Integer euId;

    @TableField("pay_date")
    private LocalDateTime payDate;

    @TableField("order_date")
    private LocalDateTime orderDate;

    @TableField("order_state")
    private Integer orderState;

    @TableField("comment_context")
    private String commentContext;

    @TableField("comment_img")
    private String commentImg;


}
