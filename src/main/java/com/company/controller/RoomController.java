package com.company.controller;

import com.company.dto.RoomDto;
import com.company.service.impl.RoomServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping
    public List<RoomDto> getRooms() {
        return roomService.getAllRooms();
    }
    @PostMapping
    public RoomDto createRoom(@RequestBody RoomDto roomDto) {
        return roomService.createRoom(roomDto);
    }
    @PutMapping
    public RoomDto updateRoom(@RequestBody RoomDto roomDto) {
        return roomService.updateRoom(roomDto);
    }
    @DeleteMapping("/{id}")
    public void deleteRoom(@PathVariable Long id) {
        roomService.deleteRoom(id);
    }
}