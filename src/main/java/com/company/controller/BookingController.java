package com.company.controller;

import com.company.dto.BookingDto;
import com.company.service.impl.BookingServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookingController {

    private final BookingServiceImpl bookingService;

    public BookingController(BookingServiceImpl bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping("/{id}")
    public BookingDto getBooking(@PathVariable Long id) {
        return bookingService.getBookingById(id);
    }

    @GetMapping
    public List<BookingDto> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @PostMapping
    public BookingDto createBooking(@RequestBody BookingDto bookingDto) {
        return bookingService.createBooking(bookingDto);
    }
    @PutMapping
    public BookingDto updateBooking(@RequestBody BookingDto bookingDto) {
        return bookingService.updateBooking(bookingDto);
    }
    @DeleteMapping("/{id}")
    public void deleteBooking(@PathVariable Long id) {
        bookingService.deleteBooking(id);
    }
}
