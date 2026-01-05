package com.company.controller;

import com.company.repository.RoomRepository;
import com.company.service.impl.BookingServiceImpl;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

    private final BookingServiceImpl bookingService;

    public BookingController(BookingServiceImpl bookingService) {
        this.bookingService = bookingService;
    }
}
