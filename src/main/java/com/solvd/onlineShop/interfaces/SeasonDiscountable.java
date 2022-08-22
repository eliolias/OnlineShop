package com.solvd.onlineShop.interfaces;

import com.solvd.onlineShop.enums.Seasons;

public interface SeasonDiscountable {
    Seasons season = Seasons.SUMMER;

    double discount = 10.00;

    void inSeasonDiscount();

}
