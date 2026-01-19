package com.company.service;

import com.company.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto getUserById(Long id);
    UserDto getUserByEmail(String email);
    UserDto createUser(UserDto userDto);
    UserDto updateUser(UserDto userDto);
    void deleteUser(Long id);
    List<UserDto> getAllUsers();
}
