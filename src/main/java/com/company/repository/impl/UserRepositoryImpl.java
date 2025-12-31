package com.company.repository.impl;

import com.company.model.User;
import com.company.repository.UserRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User getUserById(Long id) {
        return entityManager.find(User.class, id);
    }
}
