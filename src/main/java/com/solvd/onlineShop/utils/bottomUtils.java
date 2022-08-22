package com.solvd.onlineShop.utils;

import com.solvd.onlineShop.ClothingProduct;
import com.solvd.onlineShop.bottom.Bottom;
import com.solvd.onlineShop.bottom.Pants;
import com.solvd.onlineShop.bottom.Shorts;
import com.solvd.onlineShop.enums.Sizes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bottomUtils {
    public bottomUtils(){}
    public static Bottom bottom = new Bottom("Bottoms");
    public static Pants cargoPants = new Pants("Cargo Pants", 11115, 29.99, bottom, Sizes.M, "Tan", "Work Pants");
    public static Pants jeans = new Pants("Blue Jeans", 11116, 25.99, bottom, Sizes.S, "Blue", "Jeans");
    public static Shorts cargoShorts = new Shorts("Cargo Shorts", 11117, 18.99, bottom, Sizes.M, "Dark Green", "Khaki Cargo Shorts", false);
    public static Shorts swimTrunks = new Shorts("Swimming Shorts", 11118, 12.99, bottom, Sizes.XL, "Purple", "Surf swim shorts", true);
    public static List<String> bottomCategories = new ArrayList<>(Arrays.asList(cargoPants.getType(), jeans.getType(), swimTrunks.getType(), cargoShorts.getType()));
    public static List<ClothingProduct> clothingBottomProducts = new ArrayList<>(Arrays.asList(cargoPants, jeans, cargoShorts, swimTrunks));

}
