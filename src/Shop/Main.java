package Shop;
import java.util.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //Shop initialization
        Shop shop = new Shop("Online Shop");
        Category clothing = new Category("Clothing");
        Product tShirt = new Product("T-shirt", 11111, 8.99, clothing);
        Product pants = new Product("Pants", 22222, 20.99, clothing);
        Product socks = new Product("Socks", 33333, 3.49,  clothing);
        Product hoodie = new Product("Hoodie", 44444, 20.99, clothing);
        Product hat = new Product("Hat", 55555, 12.99, clothing);
        Customer bob = new Customer("bob", false);
        Cart bobCart = new Cart();

        ArrayList<Product> productsToAdd = new ArrayList<Product>(Arrays.asList(tShirt, pants, socks, socks, hat));
        ArrayList<Product> customerWishList = new ArrayList<Product>(Arrays.asList(tShirt, pants, hoodie));
        clothing.addProducts(productsToAdd);
        shop.addCategory(clothing);
        bob.setWishList(customerWishList);


        System.out.println("Welcome to " + shop.getName());
        System.out.println("Available product categories: " + shop.getAllCategories());
        System.out.println("Products available in " + clothing.getName() + " category :" + clothing.getAllProductNames());
        System.out.println(bob.getName() + "'s wishlist: " + bob.getWishListNames());
        bobCart.addWishListToCart(bob.getWishList());
        bobCart.aggregateTotalPrice();
        System.out.println("----------");
        System.out.println("Products in cart: " + bobCart.getCartProducts());
        System.out.println("Cart total Price: " + bobCart.getTotalPrice() + "$");
        System.out.println("----------");
        System.out.println(bob.getName() + " purchased : " + bobCart.makePurchase() + " for " + bobCart.getTotalPrice() +"$");













    }


}
