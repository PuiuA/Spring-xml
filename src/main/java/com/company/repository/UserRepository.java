package com.company.repository;

import com.company.model.User;

import java.util.List;

public interface UserRepository {
    User getUserById(Long id);
    List<User> getAllUsers();
    User getUserByEmail(String email);
    User updateUser(User user);
    User createUser(User user);
    void deleteUserById(Long id);
}
