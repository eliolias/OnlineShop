package Shop;

public interface Pay {
    double tax = 0.189;
    void pay(Payment payment, Cart cart);
}
