package com.company.dto;

import com.company.model.Booking;
import com.company.model.GenderUser;
import com.company.model.User;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class UserDto {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Integer age;
    private GenderUser genderUser;
    private Boolean vip;
    private ArrayList<BookingDto> bookings;

    public static User fromUserDtoToUser(UserDto userDto) {
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setPhoneNumber(userDto.getPhoneNumber());
        user.setAge(userDto.getAge());
        user.setGender(userDto.getGenderUser());
        user.setVip(userDto.getVip());
        user.setBookings((ArrayList<Booking>) userDto.getBookings()
                .stream()
                .map(BookingDto::fromBookingDtoToBookingWithoutUser)
                .collect(Collectors.toList()));
        return user;
    }

    public static UserDto fromUserToUserDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());
        userDto.setPhoneNumber(user.getPhoneNumber());
        userDto.setAge(user.getAge());
        userDto.setGenderUser(user.getGender());
        userDto.setVip(user.getVip());
        userDto.setBookings((ArrayList<BookingDto>) user.getBookings()
                .stream()
                .map(BookingDto::fromBookingToBookingDtoWithoutUser)
                .collect(Collectors.toList()));
        return userDto;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public GenderUser getGenderUser() {
        return genderUser;
    }

    public void setGenderUser(GenderUser genderUser) {
        this.genderUser = genderUser;
    }

    public Boolean getVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    public ArrayList<BookingDto> getBookings() {
        return bookings;
    }

    public void setBookings(ArrayList<BookingDto> bookings) {
        this.bookings = bookings;
    }

}
