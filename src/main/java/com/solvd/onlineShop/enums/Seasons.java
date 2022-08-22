package com.solvd.onlineShop.enums;

public enum Seasons {
    SUMMER ("Summer"),
    FALL ("Fall"),
    WINTER ("Winter"),
    SPRING ("Spring");

    private final String season;

    Seasons(String season){
        this.season = season;
    }

    public String getSeason() {
        return season;
    }
}
