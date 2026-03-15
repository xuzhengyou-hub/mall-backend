package com.yourname.mall.modules.user.service.impl;

import com.yourname.mall.modules.user.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String login(String username, String password) {
        return "TODO_JWT_TOKEN";
    }

    @Override
    public void register(String username, String password) {
        // TODO: 实现注册逻辑
    }
}
