package com.ss.center.model;

import cn.hutool.core.date.DatePattern;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * user 实体类
 */
@Data
@TableName("user")
public class User implements Serializable {

    /** 版本号 */
    private static final long serialVersionUID = -1061945554880150667L;

    @JsonProperty(index = 1)
    @TableId
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @JsonProperty(index = 2)
    private String username;

    @JsonProperty(index = 3)
    private String userAccount;

    @JsonProperty(index = 4)
    private String avatarUrl;

    @JsonProperty(index = 5)
    private Integer gender;

    @JsonProperty(index = 6)
    @NotBlank(message = "密码不能为空！")
    private String userPassword;

    @JsonProperty(index = 7)
    private String phone;

    @JsonProperty(index = 8)
    private String email;

    @JsonProperty(index = 9)
    @NotNull(message = "状态 0 - 正常不能为空！")
    private Integer userStatus;

    @JsonProperty(index = 10)
    @JsonFormat(timezone = "GMT+8", pattern = DatePattern.NORM_DATETIME_PATTERN)
    private Date createTime;


    @JsonProperty(index = 11)
    @JsonFormat(timezone = "GMT+8", pattern = DatePattern.NORM_DATETIME_PATTERN)
    private Date updateTime;

    @JsonProperty(index = 12)
    @NotNull(message = "是否删除不能为空！")
    private Integer isDelete;

    @JsonProperty(index = 13)
    @NotNull(message = "用户权限 0- 普通用户 1 - 管理员不能为空！")
    private Integer userRole;

    @JsonProperty(index = 14)
    private String planetCode;
}