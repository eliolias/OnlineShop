package Shop;

public class SweatShirt extends Product {

    private char size;
    private String color;
    private Boolean hasHood;

    public SweatShirt(String name, int sku, double price, Category category, char size, String color, Boolean hasHood) {
        super(name, sku, price, category);
        this.size = size;
        this.color = color;
        this.hasHood = hasHood;
    }

    public SweatShirt() {
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

    public Boolean getHasHood() {
        return hasHood;
    }

    public void setHasHood(Boolean hasHood) {
        this.hasHood = hasHood;
    }
}