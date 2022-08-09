package Shop;
//Not working correctly
public class Coupon extends Payment{
    private boolean isPercent;
    public Coupon(double Amount, String type, boolean isPercent){
        super(Amount, type);
    }

    public boolean isPercent() {
        return isPercent;
    }

    public void setPercent(boolean isPercent) {
        this.isPercent = isPercent;
    }
}
