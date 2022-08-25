package com.solvd.onlineShop.threads;

import static com.solvd.onlineShop.utils.BottomUtils.*;
import static com.solvd.onlineShop.utils.ShopUtils.allProducts;

public class BottomRunnable implements Runnable {
    @Override
    public void run(){
        bottom.setBottomTypes(bottomCategories);
        allProducts.addAll(clothingBottomProducts);

    }
}
