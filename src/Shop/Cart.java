package Shop;

import java.util.*;

public class Cart {
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
            this.cashDiscount(true);
        }
        payment.setAmount(payment.getAmount() - getTotalPrice());
        return productsPurchased;
    }

    public void addWishListToCart(List<Product> wishlist) {
        List<String> addedToCart = new ArrayList<>();
        for (Product product : wishlist) {
            int sku = product.getSku();
            if (sku == 11111 || sku == 22222 || sku == 33333 || sku == 44444 || sku == 55555) {
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

    public void cashDiscount(boolean isCash) {
        if (isCash) {
            double discount = totalPrice * 0.05;
            totalPrice -= discount;
            System.out.println("Purchased with Cash | Cash discount amount: " + discount + "$");
        }
    }

}



