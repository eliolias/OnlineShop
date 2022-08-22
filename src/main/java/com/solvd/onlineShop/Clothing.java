package com.solvd.onlineShop;

import com.solvd.onlineShop.enums.Seasons;

import java.util.*;

public class Clothing extends Category {

    private Seasons currentSeason;

    private List<Clothing> clothingCategories;


    public Clothing(String name, List<Clothing> clothingCategories, Seasons currentSeason) {
        super(name, currentSeason);
        this.currentSeason = currentSeason;
        this.clothingCategories = clothingCategories;
    }

    public Clothing(String name, List<Product> products) {

    }

    public Clothing(String name, Seasons currentSeason) {
        super(name);
        this.currentSeason = currentSeason;
    }

    public Clothing(String name) {
        super(name);
    }

    public Clothing() {

    }

    public Seasons getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(Seasons currentSeason) {
        this.currentSeason = currentSeason;
    }

    public List<Clothing> getClothingCategories() {
        return clothingCategories;
    }

    public void setClothingCategories(List<Clothing> clothingCategories) {
        this.clothingCategories = clothingCategories;
    }


}
