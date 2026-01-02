package com.company.model;

import javax.persistence.*;


@Entity
@Table( name = "room", schema = "booking_schema")
public class Room {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "floor", nullable = false)
    private Integer floor;
    @Column(name = "room_number", nullable = false, unique = true)
    private Integer roomNumber;
    @Enumerated(EnumType.STRING)
    @Column(name = "room_type", nullable = false)
    private RoomType roomType;
    @Column(name = "price_per_night")
    private Float pricePerNight;
    @Column(name = "capacity")
    private Integer capacity;

    public Room(Integer floor, Integer roomNumber, RoomType roomType, Integer capacity) {
        this.floor = floor;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.capacity = capacity;
        this.pricePerNight = roomType.getPrice()+((roomType.getPrice()*capacity)/10);
    }

    public Room() {}

    public Room(Builder builder) {
        this.floor = builder.floor;
        this.roomNumber = builder.roomNumber;
        this.roomType = builder.roomType;
        this.capacity = builder.capacity;
        this.pricePerNight = builder.pricePerNight;
    }

    public Long getId() {
        return id;
    }

    public Integer getFloor() {
        return floor;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public Float getPricePerNight() {
        return pricePerNight;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public void setPricePerNight(Float pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public static class Builder {
        private Integer floor;
        private Integer roomNumber;
        private RoomType roomType;
        private Float pricePerNight;
        private Integer capacity;

        public Builder setFloor(Integer floor){
            this.floor = floor;
            return this;
        }
        public Builder setRoomNumber(Integer roomNumber){
            this.roomNumber = roomNumber;
            return this;
        }
        public Builder setRoomType(RoomType roomType){
            this.roomType = roomType;
            return this;
        }
        public Builder setPricePerNight(Float pricePerNight){
            this.pricePerNight = pricePerNight;
            return this;
        }
        public Builder setCapacity(Integer capacity){
            this.capacity = capacity;
            return this;
        }
        public Room build(){
            return new Room(this);
        }
    }
}
