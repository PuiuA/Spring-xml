package com.company.service.impl;

import com.company.dto.UserDto;
import com.company.repository.impl.UserRepositoryImpl;
import com.company.service.UserService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {

    private final UserRepositoryImpl userRepository;

    public UserServiceImpl(UserRepositoryImpl userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDto getUserById(Long id) {
        return UserDto.fromUserToUserDto(userRepository.getUserById(id));
    }

    @Override
    public UserDto getUserByEmail(String email) {
        return UserDto.fromUserToUserDto(userRepository.getUserByEmail(email));
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.getAllUsers()
                .stream()
                .map(UserDto::fromUserToUserDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public UserDto createUser(UserDto userDto) {
        return UserDto.fromUserToUserDto(userRepository
                .createUser(UserDto.fromUserDtoToUser(userDto)));
    }

    @Override
    @Transactional
    public UserDto updateUser(UserDto userDto) {
        return UserDto.fromUserToUserDto(userRepository
                .updateUser(UserDto.fromUserDtoToUser(userDto)));
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        userRepository.deleteUserById(id);
    }
}
