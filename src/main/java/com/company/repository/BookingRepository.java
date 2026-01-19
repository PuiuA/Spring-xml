package com.company.repository;

import com.company.model.Booking;

public interface BookingRepository {
    public Booking getById(Long id);
}
