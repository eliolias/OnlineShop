package Shop;

import java.util.*;

public class Cart implements Inventory{
    private List<Product> cartProducts = new ArrayList<>();
    private double totalPrice;

    public Cart(List<Product> cartProducts, int totalPrice) {
        this.cartProducts = cartProducts;
        this.totalPrice = totalPrice;
    }

    public Cart() {
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<Product> getCartProducts() {
        return cartProducts;
    }

    public void setCartProducts(List<Product> cartProducts) {
        this.cartProducts = cartProducts;
    }

    public void aggregateTotalPrice() {
        for (Product product : cartProducts) {
            totalPrice += product.getPrice();
        }
    }

    public void addToCart(Product product) {
        cartProducts.add(product);
    }


    public void removeFromCart(Product product) {
        cartProducts.remove(product);
    }


    public List<String> makePurchase(Payment payment) {
        List<String> productsPurchased = new ArrayList<>();
        for (Product product : cartProducts) {
            productsPurchased.add(product.getName() + "-" + product.getPrice() + "$");
        }
        if (payment.getType().equals("Cash")) {
            this.cashDiscount();
        }
        payment.setAmount(payment.getAmount() - getTotalPrice());
        return productsPurchased;
    }

    //Need to refactor this, many methods need to moved to soon to be created Order Class.
    public void addWishListToCart(List<Product> wishlist) {
        List<String> addedToCart = new ArrayList<>();
        for (Product product : wishlist) {
            int sku = product.getSku();
            if (sku == 11111 || sku == 11112 || sku == 11113 || sku == 11114 || sku == 11115 || sku == 11116 || sku == 11117 || sku == 11118 || sku == 11119 || sku == 11120 || sku == 11121 || sku == 11122) {
                this.addToCart(product);
                addedToCart.add(product.getName());
            } else {
                System.out.println("No matching items found.");
            }
        }
        if (addedToCart.size() != 0) {
            System.out.println("Added items from wishlist to cart: " + addedToCart);
        }
    }

    public void applyCoupon(Coupon coupon) {
        if (coupon.isPercent()) {
            double discount = totalPrice * coupon.getAmount();
            totalPrice -= discount;
            System.out.println("Coupon: " + (coupon.getAmount() * 100) + "% off price | Coupon discount amount: " + discount + "$");
        } else {
            totalPrice -= coupon.getAmount();
            System.out.println("Coupon discount amount: " + coupon.getAmount() + "$");
        }
    }

    public void applyEmployeeDiscount(boolean isEmployee) {
        if (isEmployee) {
            double discount = totalPrice * 0.20;
            totalPrice -= discount;
            System.out.println("Employee discount: " + discount + "$");
        }
    }

    public void cashDiscount() {
        double discount = totalPrice * 0.05;
        totalPrice -= discount;
        System.out.println("Purchased with Cash | Cash discount amount: " + discount + "$");
    }

    @Override
    public int addInventory(int invToAdd, Shop shop) {
        shop.setInventory(shop.getInventory() + invToAdd);
        return shop.getInventory();
    }

    @Override
    public int subtractInventory(Shop shop) {
        for(Product product: cartProducts){
            shop.setInventory(shop.getInventory() - 1);
        }
        return shop.getInventory();
    }
}



