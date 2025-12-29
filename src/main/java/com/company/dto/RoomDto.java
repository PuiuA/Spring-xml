package com.company.dto;

import com.company.model.Room;
import com.company.model.RoomType;

public class RoomDto {
    private Integer floor;
    private Integer roomNumber;
    private RoomType roomType;
    private Float pricePerNight;
    private Integer capacity;

    public static Room fromRoomDtoToRoom(RoomDto roomDto) {
        Room room = new Room();
        room.setFloor(roomDto.floor);
        room.setRoomNumber(roomDto.roomNumber);
        room.setRoomType(roomDto.roomType);
        room.setPricePerNight(roomDto.pricePerNight);
        room.setCapacity(roomDto.capacity);
        return room;
    }
    public static RoomDto fromRoomToRoomDto(Room room) {
        RoomDto roomDto = new RoomDto();
        roomDto.setFloor(room.getFloor());
        roomDto.setRoomNumber(room.getRoomNumber());
        roomDto.setRoomType(room.getRoomType());
        roomDto.setPricePerNight(room.getPricePerNight());
        roomDto.setCapacity(room.getCapacity());
        return roomDto;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public Float getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(Float pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
