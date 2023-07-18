package com.ss.center.model;

import cn.hutool.core.date.DatePattern;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * user 实体类
 */
@Data
@ApiModel(description = "user")
@TableName("user")
public class User implements Serializable {

    /** 版本号 */
    private static final long serialVersionUID = -1061945554880150667L;

    @ApiModelProperty(value = "id", position = 1)
    @JsonProperty(index = 1)
    @TableId
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value = "用户昵称", position = 2)
    @JsonProperty(index = 2)
    private String username;

    @ApiModelProperty(value = "账号", position = 3)
    @JsonProperty(index = 3)
    private String userAccount;

    @ApiModelProperty(value = "用户头像", position = 4)
    @JsonProperty(index = 4)
    private String avatarUrl;

    @ApiModelProperty(value = "性别", position = 5)
    @JsonProperty(index = 5)
    private Integer gender;

    @ApiModelProperty(value = "密码", position = 6)
    @JsonProperty(index = 6)
    @NotBlank(message = "密码不能为空！")
    private String userPassword;

    @ApiModelProperty(value = "电话", position = 7)
    @JsonProperty(index = 7)
    private String phone;

    @ApiModelProperty(value = "邮箱", position = 8)
    @JsonProperty(index = 8)
    private String email;

    @ApiModelProperty(value = "状态 0 - 正常", position = 9)
    @JsonProperty(index = 9)
    @NotNull(message = "状态 0 - 正常不能为空！")
    private Integer userStatus;

    @ApiModelProperty(value = "创建时间", position = 10)
    @JsonProperty(index = 10)
    @JsonFormat(timezone = "GMT+8", pattern = DatePattern.NORM_DATETIME_PATTERN)
    private Date createTime;

    @ApiModelProperty(value = "更新时间", position = 11)
    @JsonProperty(index = 11)
    @JsonFormat(timezone = "GMT+8", pattern = DatePattern.NORM_DATETIME_PATTERN)
    private Date updateTime;

    @ApiModelProperty(value = "是否删除（逻辑删除）", position = 12)
    @JsonProperty(index = 12)
    @NotNull(message = "是否删除不能为空！")
    private Integer isDelete;

    @ApiModelProperty(value = "用户权限 0- 普通用户 1 - 管理员", position = 13)
    @JsonProperty(index = 13)
    @NotNull(message = "用户权限 0- 普通用户 1 - 管理员不能为空！")
    private Integer userRole;

    @ApiModelProperty(value = "用户编号", position = 14)
    @JsonProperty(index = 14)
    private String planetCode;
}