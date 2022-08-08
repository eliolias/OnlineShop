package Shop;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<Category> categories = new ArrayList<Category>();

    public Shop(String name) {
        this.name = name;

    }
    public Shop(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public ArrayList<String> getAllCategories(){
        ArrayList<String> categoryNames = new ArrayList<String>();
        for(Category category: categories){
            categoryNames.add(category.getName());
        }
        return categoryNames;
    }

    public void setCategories(ArrayList<Category> categories) {
        this.categories = categories;
    }

    public void addCategory(Category category) {
        categories.add(category);
    }
    public void addCategory(ArrayList<Category> newCategories){
        this.categories.addAll(newCategories);
    }
}

