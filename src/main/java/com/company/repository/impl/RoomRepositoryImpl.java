package com.company.repository.impl;

import com.company.model.Room;
import com.company.repository.RoomRepository;

import javax.persistence.EntityManager;
import java.util.List;

public class RoomRepositoryImpl implements RoomRepository {

    private EntityManager em;

    public void setEm(EntityManager em) {
        this.em = em;
    }

    @Override
    public Room getById(Long id) {
        return em.find(Room.class, id);
    }

    @Override
    public List<Room> getAllRooms() {
        return em.createQuery("from Room", Room.class).getResultList();
    }

    @Override
    public Room updateRoom(Room room) {
        return em.merge(room);
    }

    @Override
    public Room createRoom(Room room) {
        return em.merge(room);
    }

    @Override
    public void deleteRoom(Long id) {
        em.remove(getById(id));
    }


}
