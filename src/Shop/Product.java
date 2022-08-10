package Shop;

public class Product {
    private String name;
    private int sku;
    private double price;
    private Category category;

    public Product(String name, int sku, double price, Category category) {
        this.name = name;
        this.sku = sku;
        this.price = price;
        this.category = category;
    }

    public Product() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category.getName();
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return this.name + " - " + this.price + "$";
    }

}
