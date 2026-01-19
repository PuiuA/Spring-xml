package com.company.service.impl;

import com.company.dto.BookingDto;
import com.company.repository.impl.BookingRepositoryImpl;
import com.company.service.BookingService;

public class BookingServiceImpl implements BookingService {

    private BookingRepositoryImpl bookingRepository;

    public BookingServiceImpl(BookingRepositoryImpl bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public BookingDto getBooking(Long id) {
        return BookingDto.fromBookingToBookingDtoWithoutUser(bookingRepository.getById(id));
    }
}
