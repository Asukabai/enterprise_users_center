package com.ss.center.service.impl;

import com.ss.center.mapper.UserMapper;
import com.ss.center.model.User;
import com.ss.center.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import javax.servlet.http.HttpServletRequest;

/**
 * Service 接口实现
 */
@Service
@Transactional(readOnly = true)
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Override
    public long userRegister(String userAccount, String userPassword, String checkPassword, String planetCode) {
        return 0;
    }

    @Override
    public User userLogin(String userAccount, String userPassword, HttpServletRequest request) {
        return null;
    }

    @Override
    public User getSafetyUser(User originUser) {
        return null;
    }

    @Override
    public int userLogout(HttpServletRequest request) {
        return 0;
    }
}