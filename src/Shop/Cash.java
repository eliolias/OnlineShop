package Shop;

public class Cash extends Payment{
    public Cash(int availableAmount, String type){
        super(availableAmount, type, true);
    }
}
