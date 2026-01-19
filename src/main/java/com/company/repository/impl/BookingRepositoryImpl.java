package com.company.repository.impl;

import com.company.model.Booking;
import com.company.repository.BookingRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class BookingRepositoryImpl implements BookingRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Booking getById(Long id){
        return em.find(Booking.class, id);
    }

}
