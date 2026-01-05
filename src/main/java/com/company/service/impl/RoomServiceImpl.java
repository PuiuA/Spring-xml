package com.company.service.impl;

import com.company.repository.impl.RoomRepositoryImpl;
import com.company.service.RoomService;

public class RoomServiceImpl implements RoomService {

    private final RoomRepositoryImpl roomRepository;

    public RoomServiceImpl(RoomRepositoryImpl roomRepository) {
        this.roomRepository = roomRepository;
    }
}
