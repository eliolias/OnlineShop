package Shop;

public class TShirt extends Product implements SeasonDiscount{

    private String size;
    private String color;

    public TShirt(String name, int sku, double price, Category category, String size, String color) {
        super(name, sku, price, category);
        this.size = size;
        this.color = color;
    }

    public TShirt() {
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

    @Override
    public void inSeasonDiscount() {
        if(this.getCategory().getCurrentSeason() == season){
            this.setPrice(this.getPrice() - discount);
            System.out.println("In season discount for summer of 10$");
        }
    }
}
