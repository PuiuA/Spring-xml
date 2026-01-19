package com.company.service;

import com.company.dto.RoomDto;

import java.util.List;

public interface RoomService {
    RoomDto getRoomById(Long id);
    List<RoomDto> getAllRooms();
    RoomDto createRoom(RoomDto roomDto);
    RoomDto updateRoom(RoomDto roomDto);
    void deleteRoom(Long id);
}
