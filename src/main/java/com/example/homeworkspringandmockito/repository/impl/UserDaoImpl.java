package com.example.homeworkspringandmockito.repository.impl;

import com.example.homeworkspringandmockito.model.User;
import com.example.homeworkspringandmockito.repository.UserDao;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private final List<User> listOfUsers = new ArrayList<>();

    public UserDaoImpl() {
        listOfUsers.add(new User("Oleg"));
        listOfUsers.add(new User("Petr"));
        listOfUsers.add(new User("Nikolai"));
        listOfUsers.add(new User("Olga"));
        listOfUsers.add(new User("Marina"));
        listOfUsers.add(new User("Tatyana"));
    }

    @Override
    public User getUserByName(String name) {
        for (User user : listOfUsers) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return listOfUsers;
    }
}
