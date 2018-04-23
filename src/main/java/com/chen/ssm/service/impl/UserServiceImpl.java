package com.chen.ssm.service.impl;

import com.chen.ssm.mapper.UserMapper;
import com.chen.ssm.pojo.User;
import com.chen.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        List<User> userList =  userMapper.selectByExample(null);
        return userList;
    }
}
