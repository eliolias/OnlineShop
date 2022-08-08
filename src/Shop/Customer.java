package Shop;

import java.util.ArrayList;

public class Customer extends Human{
    private ArrayList<Product> wishList;
    public Customer(String name, boolean isEmployee) {
        super(name, true);
    }

    public Customer() {
    }

    public ArrayList<Product> getWishList() {
        return wishList;
    }

    public void setWishList(ArrayList<Product> wishList) {
        this.wishList = wishList;
    }

    public ArrayList<String> getWishListNames(){
        ArrayList<String> listNames = new ArrayList<>();
        for(Product wish: wishList){
            listNames.add(wish.getName());
        }
        return listNames;
    }

}
