package com.solvd.onlineShop.threads;

import com.solvd.onlineShop.ClothingProduct;

import java.util.ArrayList;
import java.util.List;

import static com.solvd.onlineShop.utils.ShopUtils.*;

public class BottomRunnable implements Runnable {
    @Override
    public void run(){
        //getBottom().setBottomTypes(bottomCategories);
        List<ClothingProduct> bottomProducts = new ArrayList<>(generateBottoms(6));
        getAllProducts().addAll(bottomProducts);

    }
}
