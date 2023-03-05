package com.example.homeworkspringandmockito.repository;

import com.example.homeworkspringandmockito.model.User;

import java.util.List;

public interface UserDao {
    User getUserByName(String name);

    List<User> findAllUsers();
}
