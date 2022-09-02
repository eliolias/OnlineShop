package com.solvd.onlineShop.threads;

import com.solvd.onlineShop.ClothingProduct;

import java.util.ArrayList;
import java.util.List;

import static com.solvd.onlineShop.utils.ShopUtils.*;

public class HeadWearRunnable implements Runnable {
    @Override
    public void run() {
        List<ClothingProduct> headWearProducts = new ArrayList<>(generateHeadWear(6));
        getAllProducts().addAll(headWearProducts);

    }

}
