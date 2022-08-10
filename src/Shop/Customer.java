package Shop;

public class Customer extends Human {

    public Customer(String name, boolean isEmployee) {
        super(name, true);
    }

    public Customer(String name) {
        super(name);
        this.setEmployee(false);
    }

    public Customer() {
    }


}
