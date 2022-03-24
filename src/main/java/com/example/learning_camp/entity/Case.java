package com.example.learning_camp.entity;

import java.time.LocalDate;
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
@ApiModel(value="Case对象", description="")
public class Case implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("case_id")
    private Integer caseId;

    @TableField("case_title")
    private String caseTitle;

    @TableField("case_schoole")
    private String caseSchoole;

    @TableField("case_num")
    private Integer caseNum;

    @TableField("case_site")
    private String caseSite;

    private LocalDate date;

    @TableField("case_url")
    private String caseUrl;

    @TableField("dept_id")
    private Integer deptId;

    @TableField("case_context")
    private String caseContext;

    @TableField("priority_number")
    private Integer priorityNumber;


}
