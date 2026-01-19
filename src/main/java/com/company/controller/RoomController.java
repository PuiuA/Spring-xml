package com.company.controller;

import com.company.dto.RoomDto;
import com.company.service.impl.RoomServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/room")
public class RoomController {
    private final RoomServiceImpl roomService;

    public RoomController(RoomServiceImpl roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/{id}")
    public RoomDto getRoom(@PathVariable Long id) {
        return roomService.getRoomById(id);
    }
}