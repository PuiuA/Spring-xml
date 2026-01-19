package com.company.repository.impl;

import com.company.model.Room;
import com.company.repository.RoomRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

public class RoomRepositoryImpl implements RoomRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Room getById(Long id) {
        return em.find(Room.class, id);
    }
}
