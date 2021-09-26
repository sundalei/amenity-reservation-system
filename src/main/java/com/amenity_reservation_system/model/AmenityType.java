package com.amenity_reservation_system.model;

public enum AmenityType {

    POOL("POOL"), SAUNA("SAUNA"), GYM("GYM");

    private final String name;

    private AmenityType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}