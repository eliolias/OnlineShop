package Shop;

import java.util.ArrayList;
//Have to implement cost of employee work to package items
public class Employee extends Human{
    double ratePerItem;
    private ArrayList<Product> wishList;
    public Employee(String name, boolean isEmployee){
        super(name, true);
        ratePerItem = 2.5;
    }
    public Employee(String name){
        super(name);
        this.setEmployee(true);
    }

    public double getRatePerItem() {
        return ratePerItem;
    }

    public void setRatePerItem(double ratePerItem) {
        this.ratePerItem = ratePerItem;
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
