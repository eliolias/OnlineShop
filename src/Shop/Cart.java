package Shop;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> cartProducts = new ArrayList<Product>();
    private double totalPrice;

    public Cart(ArrayList<Product> cartProducts, int totalPrice) {
        this.cartProducts = cartProducts;
        this.totalPrice = totalPrice;
    }

    public Cart(){
    }

    public void aggregateTotalPrice() {
        for(Product product: cartProducts){
            totalPrice += product.getPrice();
        }
    }
    public double getTotalPrice(){
        return this.totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }


    public ArrayList<String> getCartProducts(){
        ArrayList<String> productNames = new ArrayList<String>();
        for(Product product: cartProducts){
            productNames.add(product.getName() + "-" + product.getPrice() + "$");
        }
        return productNames;
    }

    public void setCartProducts(ArrayList<Product> cartProducts) {
        this.cartProducts = cartProducts;
    }

    public void addToCart(Product product){
        cartProducts.add(product);
    }

    public void removeFromCart(Product product){
        cartProducts.remove(product);
    }

    public ArrayList<String> makePurchase(Payment payment){
        ArrayList<String> productsPurchased = new ArrayList<String>();
        for(Product product: cartProducts){
            productsPurchased.add(product.getName()  + "-" + product.getPrice() + "$");
        }
        if(payment.getType() == "Cash"){
            this.cashDiscount(true);
        }
        return productsPurchased;
    }
    public void addWishListToCart(ArrayList<Product> wishlist){
        ArrayList<String> addedToCart = new ArrayList<String>();
        for(Product product: wishlist){
                switch(product.getSku()) {
                    case 11111:
                        this.addToCart(product);
                        addedToCart.add(product.getName());
                        break;
                    case 22222:
                        this.addToCart(product);
                        addedToCart.add(product.getName());
                        break;
                    case 33333:
                        this.addToCart(product);
                        addedToCart.add(product.getName());
                        break;
                    case 44444:
                        this.addToCart(product);
                        addedToCart.add(product.getName());
                        break;
                    case 55555:
                        this.addToCart(product);
                        addedToCart.add(product.getName());
                        break;
                    default:
                        System.out.println("No matching items found.");
                }
            }
        System.out.println("Added items from wishlist to cart: " + addedToCart);
        }
    public void applyCoupon(){
        //need to implement

    }

    public double applyEmployeeDiscount(boolean isEmployee){
        if(isEmployee){
            double discount = totalPrice * 0.20;
            totalPrice -= discount;
            System.out.println("Employee discount: " + discount + "$");
        }
        return totalPrice;
    }

    public double cashDiscount(boolean isCash){
        if(isCash){
            double discount = totalPrice * 0.05;
            totalPrice -= discount;
            System.out.println("Cash discount: " + discount + "$");
        }
        return totalPrice;
    }

}



