package com.ztgreat.cat.service;

import com.ztgreat.cat.entity.User;
import com.ztgreat.cat.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryUserById(int id) {
        return  userMapper.selectByPrimaryKey(id);
    }
}
