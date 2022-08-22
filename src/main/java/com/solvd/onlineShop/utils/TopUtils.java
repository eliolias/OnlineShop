package com.solvd.onlineShop.utils;

import com.solvd.onlineShop.ClothingProduct;
import com.solvd.onlineShop.enums.Sizes;
import com.solvd.onlineShop.top.SweatShirt;
import com.solvd.onlineShop.top.TShirt;
import com.solvd.onlineShop.top.Top;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TopUtils {
    public TopUtils(){}
    public static Top top = new Top("Tops");
    public static TShirt greenTShirt = new TShirt("Green T-Shirt", 11111, 8.99, top, Sizes.M, "Green", "Dress Tshirt", true);
    public static TShirt brownTShirt = new TShirt("Brown T-Shirt", 11112, 8.99, top, Sizes.L, "Brown", "plain Tshirt", false);
    public static SweatShirt hoodie = new SweatShirt("Black Hoodie", 11113, 20.99, top, Sizes.L, "Black", "Large-fit hoodie", true);
    public static SweatShirt knitSweater = new SweatShirt("Knitted Sweater", 11114, 39.99, top, Sizes.XXL, "Gray", "Sweater", false);
    public static List<String> topCategories = new ArrayList<>(Arrays.asList(greenTShirt.getType(), brownTShirt.getType(), hoodie.getType(), knitSweater.getType()));
    public static List<ClothingProduct> clothingTopProducts = new ArrayList<>(Arrays.asList(greenTShirt, brownTShirt, hoodie, knitSweater));

}
