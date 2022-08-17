/**
 * -----------------------------------
 * 林风社交论坛开源版本请务必保留此注释头信息
 * 开源地址: https://gitee.com/virus010101/linfeng-community
 * 演示站点:https://www.linfeng.tech
 * 可正常分享和学习源码，不得用于非法牟利！
 * 商业版购买联系技术客服  QQ: 3582996245
 * Copyright (c) 2021-2023 linfeng all rights reserved.
 * 版权所有，侵权必究！
 * -----------------------------------
 */
package io.linfeng.modules.app.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

@Data
@ApiModel(value = "话题添加请求")
public class DiscussAddForm {

    @ApiModelProperty(value = "介绍")
    @NotBlank
    @Length(max = 50, message = "描述不能超过50个字符")
    private String introduce;

    @ApiModelProperty(value = "标题")
    @Length(max = 15, message = "标题不能超过15个字符")
    private String title;

    @ApiModelProperty(value = "圈子id")
    private Integer topicId;

}
