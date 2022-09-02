package com.solvd.onlineShop.threads;

import com.solvd.onlineShop.ClothingProduct;

import java.util.ArrayList;
import java.util.List;

import static com.solvd.onlineShop.top.Top.getTop;
import static com.solvd.onlineShop.utils.ShopUtils.*;

public class TopRunnable implements Runnable {

    @Override
    public void run() {
        List<ClothingProduct> topProducts = new ArrayList<>(generateTops(6));
        getAllProducts().addAll(topProducts);

    }
}
