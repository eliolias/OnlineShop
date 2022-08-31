package com.solvd.onlineShop.utils;

import com.solvd.onlineShop.*;
import com.solvd.onlineShop.bottom.Bottom;
import com.solvd.onlineShop.bottom.Pants;
import com.solvd.onlineShop.bottom.Shorts;
import com.solvd.onlineShop.enums.EnumCoupon;
import com.solvd.onlineShop.enums.Seasons;
import com.solvd.onlineShop.enums.Sizes;
import com.solvd.onlineShop.headWear.Hat;
import com.solvd.onlineShop.headWear.HeadWear;
import com.solvd.onlineShop.headWear.Sunglasses;
import com.solvd.onlineShop.human.Employee;
import com.solvd.onlineShop.payment.Cash;
import com.solvd.onlineShop.payment.Coupon;
import com.solvd.onlineShop.top.SweatShirt;
import com.solvd.onlineShop.top.TShirt;
import com.solvd.onlineShop.top.Top;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShopUtils {
    public ShopUtils(){}




    public static Top top = new Top("Tops");
    public static TShirt greenTShirt = new TShirt("Green T-Shirt", 11111, 8.99, top, Sizes.M, "Green", "Dress Tshirt", true);
    public static TShirt brownTShirt = new TShirt("Brown T-Shirt", 11112, 8.99, top, Sizes.L, "Brown", "plain Tshirt", false);
    public static SweatShirt hoodie = new SweatShirt("Black Hoodie", 11113, 20.99, top, Sizes.L, "Black", "Large-fit hoodie", true);
    public static SweatShirt knitSweater = new SweatShirt("Knitted Sweater", 11114, 39.99, top, Sizes.XXL, "Gray", "Sweater", false);
    public static List<String> topCategories = new ArrayList<>(Arrays.asList(greenTShirt.getType(), brownTShirt.getType(), hoodie.getType(), knitSweater.getType()));
    public static List<ClothingProduct> clothingTopProducts = new ArrayList<>(Arrays.asList(greenTShirt, brownTShirt, hoodie, knitSweater));

    public static Bottom bottom = new Bottom("Bottoms");
    public static Pants cargoPants = new Pants("Cargo Pants", 11115, 29.99, bottom, Sizes.M, "Tan", "Work Pants", true);
    public static Pants jeans = new Pants("Blue Jeans", 11116, 25.99, bottom, Sizes.S, "Blue", "Jeans", false);
    public static Shorts cargoShorts = new Shorts("Cargo Shorts", 11117, 18.99, bottom, Sizes.M, "Dark Green", "Khaki Cargo Shorts", false);
    public static Shorts swimTrunks = new Shorts("Swimming Shorts", 11118, 12.99, bottom, Sizes.XL, "Purple", "Surf swim shorts", true);
    public static List<String> bottomCategories = new ArrayList<>(Arrays.asList(cargoPants.getType(), jeans.getType(), swimTrunks.getType(), cargoShorts.getType()));
    public static List<ClothingProduct> clothingBottomProducts = new ArrayList<>(Arrays.asList(cargoPants, jeans, cargoShorts, swimTrunks));

    public static HeadWear headWear = new HeadWear("HeadWear");
    public static Hat yankeeHat = new Hat("Yankees Hat", 11119, 15.99, headWear, Sizes.L, "Blue & White", "Baseball Hat", true);
    public static Hat beenie = new Hat("Beenie", 11120, 9.99, headWear, Sizes.L, "Burgundy", "Cuffed Beenie", false);
    public static Sunglasses aviators = new Sunglasses("Aviator SunGlasses", 11121, 50.99, headWear, Sizes.M, "Gold & Silver", "Aviator", true);
    public static Sunglasses clubMasters = new Sunglasses("ClubMaster SunGlasses", 11122, 21.99, headWear, Sizes.L, "Black", "ClubMaster", false);
    public static List<String> headWearCategories = new ArrayList<>(Arrays.asList(yankeeHat.getType(), beenie.getType(), aviators.getType(), clubMasters.getType()));
    public static List<ClothingProduct> clothingHeadWearProducts = new ArrayList<>(Arrays.asList(yankeeHat, beenie, clubMasters, aviators));


    public static Employee bob = new Employee("bob");
    public static Cart bobCart = new Cart();
    public static Cash bobCash = new Cash(500, "Cash");
    public static Coupon bobCoupon = new Coupon(EnumCoupon.TENPERCENT, "Coupon", true);
    public static List<ClothingProduct> customerWishList = new ArrayList<>(Arrays.asList(greenTShirt ,hoodie, knitSweater, jeans, swimTrunks, beenie, aviators, clubMasters));

    public static List<Clothing> clothingCategories = new ArrayList<>(Arrays.asList(top, bottom, headWear));
    public static List<Product> allProducts = new ArrayList<>();

    public static void generate(){

    }
}
