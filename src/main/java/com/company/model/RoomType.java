package com.company.model;

public enum RoomType {
    SINGLE_ROOM(200f),
    FAMILY_ROOM(400f),
    DELUXE_ROOM(500f),
    VIP_ROOM(700f);
    private final Float price;
    RoomType(Float price) {
        this.price = price;
    }
    public Float getPrice() {
        return price;
    }
}
