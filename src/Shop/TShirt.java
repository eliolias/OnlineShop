package Shop;

public class TShirt extends Product {

    private char size;
    private String color;

    public TShirt(String name, int sku, double price, Category category, char size, String color) {
        super(name, sku, price, category);
        this.size = size;
        this.color = color;
    }

    public TShirt() {
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
}
