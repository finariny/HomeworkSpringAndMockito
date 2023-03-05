package com.example.homeworkspringandmockito.repository.impl;

import org.junit.jupiter.api.Test;

import static com.example.homeworkspringandmockito.constant.UserConstants.EXISTING_USER;
import static com.example.homeworkspringandmockito.constant.UserConstants.NON_EXISTENT_USER;
import static org.junit.jupiter.api.Assertions.*;

public class UserDaoTest {

    private final UserDaoImpl userDaoImpl = new UserDaoImpl();

    @Test
    public void shouldReturnUserWhenCallingTheMethodGetUserByName() {
        assertEquals(EXISTING_USER, userDaoImpl.getUserByName(EXISTING_USER.getName()));
    }

    @Test
    public void shouldReturnNullWhenCallingTheMethodGetUserByName() {
        assertNull(userDaoImpl.getUserByName(NON_EXISTENT_USER.getName()));
    }
}
