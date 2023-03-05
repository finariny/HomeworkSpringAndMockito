package com.example.homeworkspringandmockito.service.impl;

import com.example.homeworkspringandmockito.repository.UserDao;
import com.example.homeworkspringandmockito.model.User;
import com.example.homeworkspringandmockito.service.UserService;

public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean checkUserExist(User user) {
        return userDao.findAllUsers().contains(user);
    }
}
