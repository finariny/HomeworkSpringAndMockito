package com.example.homeworkspringandmockito.service.impl;

import com.example.homeworkspringandmockito.repository.UserDao;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.example.homeworkspringandmockito.constant.UserConstants.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserDao daoMock;

    @InjectMocks
    private UserServiceImpl out;

    @Test
    public void shouldReturnTrueWhenCallingTheMethodCheckUserExist() {
        when(daoMock.findAllUsers()).thenReturn(LIST_OF_USERS);
        assertTrue(out.checkUserExist(EXISTING_USER));
        verify(daoMock, only()).findAllUsers();
    }

    @Test
    public void shouldReturnFalseWhenCallingTheMethodCheckUserExist() {
        when(daoMock.findAllUsers()).thenReturn(LIST_OF_USERS);
        assertFalse(out.checkUserExist(NON_EXISTENT_USER));
        verify(daoMock, only()).findAllUsers();
    }
}
