package com.company.repository.impl;

import com.company.model.Booking;
import com.company.repository.BookingRepository;

import javax.persistence.EntityManager;
import java.util.List;

public class BookingRepositoryImpl implements BookingRepository {

    private EntityManager em;

    public void setEm(EntityManager em) {
        this.em = em;
    }

    @Override
    public Booking getById(Long id){
        return em.find(Booking.class, id);
    }

    @Override
    public List<Booking> getAll() {
        return em.createQuery("from Booking", Booking.class).getResultList();
    }

    @Override
    public Booking createBooking(Booking booking) {
        return em.merge(booking);
    }

    @Override
    public void deleteBooking(Long id) {
        em.remove(id);
    }

    @Override
    public Booking updateBooking(Booking booking) {
        return em.merge(booking);
    }

}
