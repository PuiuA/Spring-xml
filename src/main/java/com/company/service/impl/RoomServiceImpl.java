package com.company.service.impl;

import com.company.dto.RoomDto;
import com.company.repository.impl.RoomRepositoryImpl;
import com.company.service.RoomService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

public class RoomServiceImpl implements RoomService {

    private final RoomRepositoryImpl roomRepository;

    public RoomServiceImpl(RoomRepositoryImpl roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public RoomDto getRoomById(Long id) {
        return RoomDto.fromRoomToRoomDto(roomRepository.getById(id));
    }

    @Override
    public List<RoomDto> getAllRooms() {
        return roomRepository.getAllRooms()
                .stream()
                .map(RoomDto::fromRoomToRoomDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public RoomDto createRoom(RoomDto roomDto) {
        return RoomDto.fromRoomToRoomDto(roomRepository
                .createRoom(RoomDto.fromRoomDtoToRoom(roomDto)));
    }

    @Override
    @Transactional
    public RoomDto updateRoom(RoomDto roomDto) {
        return RoomDto.fromRoomToRoomDto(roomRepository
                .updateRoom(RoomDto.fromRoomDtoToRoom(roomDto)));
    }

    @Override
    @Transactional
    public void deleteRoom(Long id) {
        roomRepository.deleteRoom(id);
    }
}
