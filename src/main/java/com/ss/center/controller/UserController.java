package com.ss.center.controller;

import com.ss.center.common.BaseResponse;
import com.ss.center.common.ResultUtils;
import com.ss.center.dto.UserRegisterRequest;
import com.ss.center.service.UserService;
import lombok.NonNull;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * 用户接口
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/register")
    public BaseResponse<Long> userRegister (@NonNull @RequestBody UserRegisterRequest userRegisterRequest){

        //校验(统一校验)

        String userAccount = userRegisterRequest.getUserAccount();
        String userPassword = userRegisterRequest.getUserPassword();
        String checkPassword = userRegisterRequest.getCheckPassword();
        String planetCode = userRegisterRequest.getPlanetCode();

        long register = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        return ResultUtils.success(register);
    }
}
