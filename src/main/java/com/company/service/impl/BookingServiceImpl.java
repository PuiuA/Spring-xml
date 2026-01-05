package com.company.service.impl;

import com.company.repository.impl.BookingRepositoryImpl;
import com.company.service.BookingService;

public class BookingServiceImpl implements BookingService {

    private BookingRepositoryImpl bookingRepository;

    public BookingServiceImpl(BookingRepositoryImpl bookingRepository) {
        this.bookingRepository = bookingRepository;
    }
}
