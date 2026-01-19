package com.company.service.impl;

import com.company.dto.RoomDto;
import com.company.repository.impl.RoomRepositoryImpl;
import com.company.service.RoomService;

public class RoomServiceImpl implements RoomService {

    private final RoomRepositoryImpl roomRepository;

    public RoomServiceImpl(RoomRepositoryImpl roomRepository) {
        this.roomRepository = roomRepository;
    }

    public RoomDto getRoomById(Long id) {
        return RoomDto.fromRoomToRoomDto(roomRepository.getById(id));
    }
}
