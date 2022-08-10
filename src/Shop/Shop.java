package Shop;

import java.util.*;

public class Shop {
    private String name;
    private List<Category> categories = new ArrayList<>();

    public Shop(String name) {
        this.name = name;

    }

    public Shop() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public void addCategory(Category category) {
        categories.add(category);
    }

    public void removeCategory(Category category) {
        categories.remove(category);
    }

    public void addCategories(List<Category> newCategories) {
        categories.addAll(newCategories);
    }

    public void removeCategories(List<Category> categoriesToRemove) {
        categories.removeAll(categoriesToRemove);
    }
}

