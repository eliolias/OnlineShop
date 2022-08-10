package Shop;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Shop initialization
        Shop shop = new Shop("Online Shop");
        Category clothing = new Category("Clothing");
        Product tShirt = new Product("T-shirt", 11111, 8.99, clothing);
        Product pants = new Product("Pants", 22222, 20.99, clothing);
        Product socks = new Product("Socks", 33333, 3.49, clothing);
        Product hoodie = new Product("Hoodie", 44444, 20.99, clothing);
        Product hat = new Product("Hat", 55555, 12.99, clothing);
        Employee bob = new Employee("bob");
        Cart bobCart = new Cart();
        Cash bobCash = new Cash(500, "Cash");
        Coupon bobCoupon = new Coupon(.25, "Coupon", true);

        List<Product> productsToAdd = new ArrayList<>(Arrays.asList(tShirt, pants, socks, socks, hat));
        List<Product> customerWishList = new ArrayList<>(Arrays.asList(tShirt, pants, hoodie));
        clothing.addProducts(productsToAdd);
        shop.addCategory(clothing);
        bob.setWishList(customerWishList);

        System.out.println("Welcome to " + shop.getName());
        System.out.println("Available product categories: " + shop.getCategories());
        System.out.println("Products available in " + clothing.getName() + " category :" + clothing.getProducts());
        System.out.println(bob.getName() + "'s wishlist: " + bob.getWishListNames());
        bobCart.addWishListToCart(bob.getWishList());
        bobCart.aggregateTotalPrice();
        System.out.println("Cart total Price: " + bobCart.getTotalPrice() + "$");
        bobCart.applyEmployeeDiscount(bob.isEmployee());
        bobCart.applyCoupon(bobCoupon);
        System.out.println("----------");
        System.out.println("Products in cart: " + bobCart.getCartProducts());
        System.out.println("Cart total Price with discounts: " + bobCart.getTotalPrice() + "$");
        System.out.println("----------");
        System.out.println(bob.getName() + " purchased : " + bobCart.makePurchase(bobCash) + " for " + bobCart.getTotalPrice() + "$");
        System.out.println("----------");
        System.out.println("Cash left: " + bobCash.getAmount());

    }


}
