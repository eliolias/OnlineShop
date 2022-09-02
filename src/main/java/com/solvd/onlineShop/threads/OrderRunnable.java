package com.solvd.onlineShop.threads;


import com.solvd.onlineShop.ClothingProduct;

import java.util.ArrayList;
import java.util.List;

import static com.solvd.onlineShop.utils.ShopUtils.*;

public class OrderRunnable  implements Runnable{
    @Override
    public void run(){
        List<ClothingProduct> topProducts = new ArrayList<>(generateTops(2));
        List<ClothingProduct> bottomProducts = new ArrayList<>(generateBottoms(2));
        List<ClothingProduct> headWearProducts = new ArrayList<>(generateHeadWear(2));
        getGeneratedWishList().addAll(topProducts);
        getGeneratedWishList().addAll(bottomProducts);
        getGeneratedWishList().addAll(headWearProducts);
    }

}