package com.ob11to.service;

import com.ob11to.service.service.UserService;

public class AppRunner {
    public static void main(String[] args) {
        var userService = new UserService();
        System.out.println(userService.getUser(25L));
        System.out.println("Hello");
    }
}
