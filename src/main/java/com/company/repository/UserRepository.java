package com.company.repository;

import com.company.model.User;

public interface UserRepository {
    User getUserById(Long id);
}
