package com.company.repository;

import com.company.model.Booking;

import java.util.List;

public interface BookingRepository {
    public Booking getById(Long id);
    public List<Booking> getAll();
    public Booking createBooking(Booking booking);
    public void deleteBooking(Long id);
    public Booking updateBooking(Booking booking);
}
