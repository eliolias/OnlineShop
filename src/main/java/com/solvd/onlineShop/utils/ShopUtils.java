package com.solvd.onlineShop.utils;

import com.solvd.onlineShop.*;
import com.solvd.onlineShop.enums.EnumCoupon;
import com.solvd.onlineShop.enums.Seasons;
import com.solvd.onlineShop.human.Employee;
import com.solvd.onlineShop.payment.Cash;
import com.solvd.onlineShop.payment.Coupon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.solvd.onlineShop.utils.BottomUtils.*;
import static com.solvd.onlineShop.utils.HeadWearUtils.*;
import static com.solvd.onlineShop.utils.TopUtils.*;

public class ShopUtils {
    public ShopUtils(){}
    public static Shop shop = new Shop("Online Shop");
    public static Clothing clothing = new Clothing("Clothing", Seasons.SUMMER);
    public static Employee bob = new Employee("bob");
    public static Cart bobCart = new Cart();
    public static Cash bobCash = new Cash(500, "Cash");
    public static Coupon bobCoupon = new Coupon(EnumCoupon.TENPERCENT, "Coupon", true);
    public static List<ClothingProduct> customerWishList = new ArrayList<>(Arrays.asList(greenTShirt ,hoodie, knitSweater, jeans, swimTrunks, beenie, aviators, clubMasters));
    public static List<Clothing> shopCategories = new ArrayList<>(Arrays.asList(clothing));
    public static List<Clothing> clothingCategories = new ArrayList<>(Arrays.asList(top, bottom, headWear));
    public static List<Product> allProducts = new ArrayList<>();
}
