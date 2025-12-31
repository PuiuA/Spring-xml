package com.company.service.impl;


import com.company.dto.UserDto;
import com.company.repository.impl.UserRepositoryImpl;
import com.company.service.UserService;

public class UserServiceImpl implements UserService {

    private final UserRepositoryImpl userRepository;

    public UserServiceImpl(UserRepositoryImpl userRepository) {
        this.userRepository = userRepository;
    }

    public UserDto getUserById(Long id) {
        return UserDto.fromUserToUserDto(userRepository.getUserById(id));
    }
}
