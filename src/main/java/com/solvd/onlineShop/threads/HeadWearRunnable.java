package com.solvd.onlineShop.threads;

import static com.solvd.onlineShop.utils.HeadWearUtils.*;
import static com.solvd.onlineShop.utils.ShopUtils.allProducts;

public class HeadWearRunnable  implements Runnable{
    @Override
    public void run(){
        headWear.setHeadWearTypes(headWearCategories);
        allProducts.addAll(clothingHeadWearProducts);
    }

}
