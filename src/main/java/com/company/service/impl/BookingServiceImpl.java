package com.company.service.impl;

import com.company.repository.BookingRepository;
import com.company.service.BookingService;

public class BookingServiceImpl implements BookingService {

    private BookingRepository bookingRepository;

    public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }
}
