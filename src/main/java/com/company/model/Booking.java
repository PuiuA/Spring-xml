package com.company.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "booking", schema = "booking_schema")
public class Booking {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "price", nullable = false)
    private float price;
    @Column(name = "check_in", nullable = false)
    private LocalDate checkIn;
    @Column(name = "check_out", nullable = false)
    private LocalDate checkOut;
    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private BookingStatus status;
    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;
    @ManyToOne
    @JoinColumn( name = "user_id", nullable = false)
    private User user;

    public Booking(float price, String checkIn, String checkOut, BookingStatus status, Room room, User user) {
        this.price = price;
        this.checkIn = LocalDate.parse(checkIn);
        this.checkOut = LocalDate.parse(checkOut);
        this.status = status;
        this.room = room;
        this.user = user;
    }

    public Booking() {}

    public Booking(Builder builder) {
        this.id = builder.id;
        this.price = builder.price;
        this.checkIn = builder.checkIn;
        this.checkOut = builder.checkOut;
        this.status = builder.status;
        this.room = builder.room;
        this.user = builder.user;
    }

    public Long getId() {
        return id;
    }

    public float getPrice() {
        return price;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public Room getRoom() {
        return room;
    }

    public User getUser() {
        return user;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public static class Builder{
        private Long id;
        private float price;
        private LocalDate checkIn;
        private LocalDate checkOut;
        private BookingStatus status;
        private Room room;
        private User user;

        public Builder(){}

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }
        public Builder setPrice(float price){
            this.price = price;
            return this;
        }
        public Builder setCheckIn(LocalDate checkIn){
            this.checkIn = checkIn;
            return this;
        }
        public Builder setCheckOut (LocalDate checkOut){
            this.checkOut = checkOut;
            return this;
        }
        public Builder setStatus(BookingStatus status){
            this.status = status;
            return this;
        }
        public Builder setRoom(Room room){
            this.room = room;
            return this;
        }
        public Builder setUser(User user){
            this.user = user;
            return this;
        }

        public Booking build(){
            return new Booking(this);
        }

    }
}
