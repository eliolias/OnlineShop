package Shop.Bottom;

import Shop.Category;
import Shop.Product;
import Shop.SeasonDiscount;

public class Shorts extends Product implements SeasonDiscount {

    private String size;
    private String color;
    boolean forSwimming;

    public Shorts(String name, int sku, double price, Category category, String size, String color, boolean forSwimming) {
        super(name, sku, price, category);
        this.size = size;
        this.color = color;
        this.forSwimming = forSwimming;
    }

    public Shorts() {
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

    public boolean isForSwimming() {
        return forSwimming;
    }

    public void setForSwimming(boolean forSwimming) {
        this.forSwimming = forSwimming;
    }

    @Override
    public void inSeasonDiscount() {
        if(this.getCategory().getCurrentSeason() == season){
            this.setPrice(this.getPrice() - discount);
            System.out.println("In season discount for summer of 10$");
        }
    }
}
