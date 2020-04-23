package com.hao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hao.bean.User;
import com.hao.dao.master.UserMapper;

@Service
public class UserService {
    
    @Autowired
    UserMapper userMapper;
    
    public Integer insert(User user) {
        return userMapper.insert(user);
    }

    public List<User> getList() {
        return userMapper.getAll();
    }

}
