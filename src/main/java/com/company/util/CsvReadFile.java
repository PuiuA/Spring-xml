package com.company.util;

import com.company.model.Room;
import com.company.model.RoomType;
import com.opencsv.CSVReader;


import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CsvReadFile {

    private static List<Room> readCsvFile(String fileName) {
        List<Room> rooms = new ArrayList<>();
        String[] nextLine;

        try(CSVReader csvReadFile = new CSVReader(new FileReader(fileName))) {
            String[] firstLine = csvReadFile.readNext();
            while(csvReadFile.readNext() != null) {
                nextLine = csvReadFile.readNext();
                rooms.add(createRoomFromCsv(nextLine));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return rooms;
    }

    private static Room createRoomFromCsv(String[] stringRoom){
        return new Room.Builder()
                .setFloor(Integer.parseInt(stringRoom[0]))
                .setRoomNumber(Integer.getInteger(stringRoom[1]))
                .setRoomType(RoomType.valueOf(stringRoom[2]))
                .setCapacity(Integer.getInteger(stringRoom[3]))
                .build();
    }

}
