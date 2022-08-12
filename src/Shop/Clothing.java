package Shop;

import java.util.*;

public class Clothing extends Category {
    private List<Clothing> clothingCategories;


    public Clothing(String name, List<Product> products, String currentSeason, List<Clothing> clothingCategories) {
        super(name, products, currentSeason);

        this.clothingCategories = clothingCategories;
    }

    public Clothing(String name, String currentSeason) {
        super(name, currentSeason);
    }

    public Clothing(String name, List<Product> products){

    }

    public Clothing(String name){

    }

    public Clothing() {

    }


    public List<Clothing> getClothingCategories() {
        return clothingCategories;
    }

    public void setClothingCategories(List<Clothing> clothingCategories) {
        this.clothingCategories = clothingCategories;
    }

}
