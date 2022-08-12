package Shop;

import java.util.List;

public class Customer extends Human implements Pay, Rewards{

    public Customer(String name, boolean isEmployee, List<String> sizes, int frequentShopperPoints) {
        super(name, true, frequentShopperPoints);
    }

    public Customer(String name, boolean isEmployee, List<String> sizes) {
        super(name, true);
    }

    public Customer(String name) {
        super(name);
        this.setEmployee(false);
    }

    public Customer() {
    }

    @Override
    public void pay(Payment payment, Cart cart) {
        if(payment.getAmount() > cart.getTotalPrice()){
            double taxes = cart.getTotalPrice() * tax;
            payment.setAmount(payment.getAmount() - (cart.getTotalPrice() + taxes));
            System.out.println("Customer" + this.getName() + "Remaining funds: " + payment.getAmount());
        }
        System.out.println("Insufficient funds");

    }

    @Override
    public int earnPoints(Cart cart) {
        int pointsToAdd = 0;
        for(Product product: cart.getCartProducts()){
            pointsToAdd++;
        }
        this.setshopperPoints(this.getshopperPoints() + pointsToAdd);
        return this.getshopperPoints();
    }
}
