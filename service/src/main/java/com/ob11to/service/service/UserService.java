package com.ob11to.service.service;

import com.ob11to.database.dao.UserDao;
import com.ob11to.service.dto.UserDto;

import java.util.Optional;

public class UserService {

    private final UserDao userDao = new UserDao();

    public Optional<UserDto> getUser(Long id){
        return userDao.findById(id)
                .map(user -> new UserDto());
    }
}
