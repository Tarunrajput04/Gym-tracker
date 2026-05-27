package com.tarun.gymtracker.user.controller;

import com.tarun.gymtracker.user.dto.LoginRequest;
import com.tarun.gymtracker.user.dto.LoginResponse;
import com.tarun.gymtracker.user.dto.RegisterRequest;
import com.tarun.gymtracker.user.entity.User;
import com.tarun.gymtracker.user.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public User register(@Valid @RequestBody RegisterRequest request) {
        return userService.register(request);
    }

    @PostMapping("/login")
    public LoginResponse login(
            @RequestBody LoginRequest request
    ) {
        return userService.login(request);
    }

    @GetMapping("/profile")
    public String profile() {
        return "Protected profile endpoint";
    }
}