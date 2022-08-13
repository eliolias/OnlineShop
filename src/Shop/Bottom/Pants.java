package Shop;

public class Pants extends Product {

    private String size;
    private String color;
    private String type;

    public Pants(String name, int sku, double price, Category category, String size, String color, String type) {
        super(name, sku, price, category);
        this.size = size;
        this.color = color;
        this.type = type;
    }

    public Pants() {
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
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
}
