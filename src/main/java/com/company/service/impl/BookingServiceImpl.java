package com.company.service.impl;

import com.company.dto.BookingDto;
import com.company.repository.impl.BookingRepositoryImpl;
import com.company.service.BookingService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

public class BookingServiceImpl implements BookingService {

    private BookingRepositoryImpl bookingRepository;

    public BookingServiceImpl(BookingRepositoryImpl bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public BookingDto getBookingById(Long id) {
        return BookingDto.fromBookingToBookingDtoWithoutUser(bookingRepository.getById(id));
    }

    @Override
    public List<BookingDto> getAllBookings() {
        return bookingRepository.getAll()
                .stream()
                .map(BookingDto::fromBookingToBookingDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public BookingDto createBooking(BookingDto booking) {
        return BookingDto.fromBookingToBookingDto(bookingRepository
                .createBooking(BookingDto.fromBookingDtoToBooking(booking)));
    }

    @Override
    @Transactional
    public BookingDto updateBooking(BookingDto booking) {
        return BookingDto.fromBookingToBookingDto(bookingRepository
                .updateBooking(BookingDto.fromBookingDtoToBooking(booking)));
    }

    @Override
    @Transactional
    public void deleteBooking(Long id) {
        bookingRepository.deleteBooking(id);
    }
}
