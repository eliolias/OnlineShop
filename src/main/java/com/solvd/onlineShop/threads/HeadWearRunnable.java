package com.solvd.onlineShop.threads;

import static com.solvd.onlineShop.utils.ShopUtils.*;

public class HeadWearRunnable  implements Runnable{
    @Override
    public void run(){
        headWear.setHeadWearTypes(headWearCategories);
        allProducts.addAll(clothingHeadWearProducts);
    }

}
