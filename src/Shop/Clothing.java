
package Shop;

import java.util.*;

public class Clothing extends Category {

    private String currentSeason;

    private List<Category> clothingCategories;


    public Clothing(String name, List<Category> clothingCategories, String currentSeason) {
        super(name);
        this.currentSeason = currentSeason;
        this.clothingCategories = clothingCategories;
    }

    public Clothing(String name, List<Product> products) {

    }

    public Clothing(String name, String currentSeason) {
        super(name);
        this.currentSeason = currentSeason;
    }

    public Clothing(String name) {
        super(name);
    }

    public Clothing() {

    }

    public String getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(String currentSeason) {
        this.currentSeason = currentSeason;
    }

    public List<Category> getClothingCategories() {
        return clothingCategories;
    }

    public void setClothingCategories(List<Category> clothingCategories) {
        this.clothingCategories = clothingCategories;
    }


}
