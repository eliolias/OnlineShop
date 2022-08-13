package Shop;

import Shop.Payment.Payment;

public interface Pay {
    double tax = 0.189;
    void pay(Payment payment, Cart cart);
}
