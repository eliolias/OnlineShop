package Shop;
//needs to get implemented with subclasses Credit Card and Cash
public abstract class Payment {
    int availableAmount;
    String type;
    boolean isCash;

    public Payment(int availableAmount, String type, boolean isCash) {
        this.availableAmount = availableAmount;
        this.type = type;
        this.isCash = isCash;
    }

    public int getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(int availableAmount) {
        this.availableAmount = availableAmount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isCash() {
        return isCash;
    }

    public void setCash(boolean cash) {
        isCash = cash;
    }
}
