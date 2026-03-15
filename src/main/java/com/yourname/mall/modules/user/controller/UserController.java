package com.yourname.mall.modules.user.controller;

import com.yourname.mall.common.Result;
import com.yourname.mall.modules.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public Result<Void> register(@RequestBody Map<String, String> payload) {
        userService.register(payload.get("username"), payload.get("password"));
        return Result.success("注册成功", null);
    }

    @PostMapping("/login")
    public Result<Map<String, String>> login(@RequestBody Map<String, String> payload) {
        String token = userService.login(payload.get("username"), payload.get("password"));
        return Result.success(Map.of("token", token));
    }

    @GetMapping("/info")
    public Result<Map<String, String>> info() {
        return Result.success(Map.of("username", "demo-user"));
    }
}
