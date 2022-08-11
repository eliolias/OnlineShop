package Shop;

public class Shorts extends Product {

    private char size;
    private String color;
    boolean forSwimming;

    public Shorts(String name, int sku, double price, Category category, char size, String color, boolean forSwimming) {
        super(name, sku, price, category);
        this.size = size;
        this.color = color;
        this.forSwimming = forSwimming;
    }

    public Shorts() {
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isForSwimming() {
        return forSwimming;
    }

    public void setForSwimming(boolean forSwimming) {
        this.forSwimming = forSwimming;
    }
}
