package Shop;

public interface Inventory {

    int addInventory(int invToAdd, Shop shop);

    int subtractInventory(Shop shop);
}
