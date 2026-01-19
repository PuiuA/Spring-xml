package com.company.repository.impl;

import com.company.model.User;
import com.company.repository.UserRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    private EntityManager em;

    public void setEm(EntityManager em) {
        this.em = em;
    }

    @Override
    public User getUserById(Long id) {
        return em.find(User.class, id);
    }

    @Override
    public List<User> getAllUsers() {
        return em.createQuery("from User", User.class).getResultList();
    }
    @Override
    public User getUserByEmail(String email) {
        return em.find(User.class, email);
    }
    @Override
    public User updateUser(User user) {
        return em.merge(user);
    }
    @Override
    public User createUser(User user) {
        return em.merge(user);
    }
    @Override
    public void deleteUserById(Long id) {
        User user = em.find(User.class, id);
        em.remove(user);
    }
}
