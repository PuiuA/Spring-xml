package com.company.repository;

import com.company.model.Room;

import java.util.List;

public interface RoomRepository {
    public Room getById(Long id);
    public List<Room> getAllRooms();
    public Room updateRoom(Room room);
    public Room createRoom(Room room);
    public void deleteRoom(Long id);
}
