package com.solvd.onlineShop.threads;

import static com.solvd.onlineShop.utils.ShopUtils.*;

public class BottomRunnable implements Runnable {
    @Override
    public void run(){
        bottom.setBottomTypes(bottomCategories);
        allProducts.addAll(clothingBottomProducts);

    }
}
