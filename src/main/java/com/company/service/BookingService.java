package com.company.service;

import com.company.dto.BookingDto;

import java.util.List;

public interface BookingService {
    BookingDto getBookingById(Long id);
    List<BookingDto> getAllBookings();
    BookingDto createBooking(BookingDto booking);
    BookingDto updateBooking(BookingDto booking);
    void deleteBooking(Long id);
}
