package Shop;

public class Sunglasses extends Product {

    private char size;
    private String color;
    private String type;
    private Boolean isPolarized;

    public Sunglasses(String name, int sku, double price, Category category, char size, String color, String type, Boolean isPolarized) {
        super(name, sku, price, category);
        this.size = size;
        this.color = color;
        this.type = type;
        this.isPolarized = isPolarized;
    }

    public Sunglasses() {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getPolarized() {
        return isPolarized;
    }

    public void setPolarized(Boolean polarized) {
        isPolarized = polarized;
    }
}
