package com.example.homeworkspringandmockito.constant;

import com.example.homeworkspringandmockito.model.User;

import java.util.List;

public class UserConstants {
    public static final User EXISTING_USER = new User("Olga");
    public static final User NON_EXISTENT_USER = new User("Anton");
    public static final List<User> LIST_OF_USERS = List.of(
            new User("Oleg"),
            new User("Petr"),
            new User("Nikolai"),
            new User("Olga"),
            new User("Marina"),
            new User("Tatyana")
    );
}
