package com.solvd.onlineShop.utils;

import com.solvd.onlineShop.ClothingProduct;
import com.solvd.onlineShop.enums.Sizes;
import com.solvd.onlineShop.headWear.Hat;
import com.solvd.onlineShop.headWear.HeadWear;
import com.solvd.onlineShop.headWear.Sunglasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class headWearUtils {
    public static HeadWear headWear = new HeadWear("HeadWear");
    public static Hat yankeeHat = new Hat("Yankees Hat", 11119, 15.99, headWear, Sizes.L, "Blue & White", "Baseball Hat");
    public static Hat beenie = new Hat("Beenie", 11120, 9.99, headWear, Sizes.L, "Burgundy", "Cuffed Beenie");
    public static Sunglasses aviators = new Sunglasses("Aviator SunGlasses", 11121, 50.99, headWear, Sizes.M, "Gold & Silver", "Aviator", true);
    public static Sunglasses clubMasters = new Sunglasses("ClubMaster SunGlasses", 11122, 21.99, headWear, Sizes.L, "Black", "ClubMaster", false);
    public static List<String> headWearCategories = new ArrayList<>(Arrays.asList(yankeeHat.getType(), beenie.getType(), aviators.getType(), clubMasters.getType()));
    public static List<ClothingProduct> clothingHeadWearProducts = new ArrayList<>(Arrays.asList(yankeeHat, beenie, clubMasters, aviators));
}
