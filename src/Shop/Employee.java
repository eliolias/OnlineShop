package Shop;

import java.util.*;

public class Employee extends Human {
    private double ratePerItem;
    private double totalPay;

    public Employee(String name, boolean isEmployee, double totalPay) {
        super(name, true);
        this.totalPay = totalPay;
        ratePerItem = 2.5;
    }

    public Employee(String name) {
        super(name);
        this.setEmployee(true);
    }

    public Employee() {

    }

    public double getRatePerItem() {
        return ratePerItem;
    }

    public void setRatePerItem(double ratePerItem) {
        this.ratePerItem = ratePerItem;
    }

    public double getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }

    public void payForOrder() {
        //implement cost of employee to package X items
    }


}
