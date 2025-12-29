package com.company.dto;

import com.company.model.Booking;
import com.company.model.BookingStatus;
import java.time.LocalDate;

public class BookingDto {
    private float price;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private BookingStatus status;
    private RoomDto room;
    private UserDto user;

    public static  Booking fromBookingDtoToBooking(BookingDto bookingDto){
        return new Booking.Builder()
                .setPrice(bookingDto.getPrice())
                .setCheckIn(bookingDto.getCheckIn())
                .setCheckOut(bookingDto.getCheckOut())
                .setStatus(bookingDto.getStatus())
                .setRoom(RoomDto.fromRoomDtoToRoom(bookingDto.getRoom()))
                .setUser(UserDto.fromUserDtoToUser(bookingDto.getUser()))
                .build();
    }
    public static  BookingDto fromBookingToBookingDto(Booking booking){
        BookingDto bookingDto = fromBookingToBookingDtoWithoutUser(booking);
        bookingDto.setUser(UserDto.fromUserToUserDto(booking.getUser()));
        return bookingDto;
    }

    public static  Booking fromBookingDtoToBookingWithoutUser(BookingDto bookingDto){
        return new Booking.Builder()
                .setPrice(bookingDto.getPrice())
                .setCheckIn(bookingDto.getCheckIn())
                .setCheckOut(bookingDto.getCheckOut())
                .setStatus(bookingDto.getStatus())
                .setRoom(RoomDto.fromRoomDtoToRoom(bookingDto.getRoom()))
                .build();
    }

    public static BookingDto fromBookingToBookingDtoWithoutUser(Booking booking){
        BookingDto bookingDto = new BookingDto();
        bookingDto.setPrice(booking.getPrice());
        bookingDto.setCheckIn(booking.getCheckIn());
        bookingDto.setCheckOut(booking.getCheckOut());
        bookingDto.setStatus(booking.getStatus());
        bookingDto.setRoom(RoomDto.fromRoomToRoomDto(booking.getRoom()));
        return bookingDto;
    }


    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }

    public RoomDto getRoom() {
        return room;
    }

    public void setRoom(RoomDto room) {
        this.room = room;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }
}
