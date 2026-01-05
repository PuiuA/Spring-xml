package com.company.controller;

import com.company.service.impl.RoomServiceImpl;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController {
    private final RoomServiceImpl roomService;

    public RoomController(RoomServiceImpl roomService) {
        this.roomService = roomService;
    }
}