package com.solvd.onlineShop.threads;

import static com.solvd.onlineShop.utils.ShopUtils.*;

public class TopRunnable implements Runnable{

    @Override
    public void run(){
        top.setTopTypes(topCategories);
        allProducts.addAll(clothingTopProducts);

    }
}
