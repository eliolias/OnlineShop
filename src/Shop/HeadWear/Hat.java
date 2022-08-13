package Shop.HeadWear;

import Shop.Category;
import Shop.Product;
import Shop.Warranty;

public class Hat extends Product implements Warranty {

    private String size;
    private String color;
    private String type;

    public Hat(String name, int sku, double price, Category category, String size, String color, String type) {
        super(name, sku, price, category);
        this.size = size;
        this.color = color;
        this.type = type;
    }

    public Hat() {
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

    @Override
    public double warrantyPrice() {
        double price = warrantyPrice * this.getPrice();
        return price;
    }

    public void addWarranty(){
        System.out.println("Hat Warranty purchased for: " + warrantyPrice());
        this.setPrice(this.getPrice() + warrantyPrice());
    }

    @Override
    public String warrantyPolicy() {
        System.out.println("Warranty on hats covers material issues, loss, and theft.");
        return null;
    }
}
