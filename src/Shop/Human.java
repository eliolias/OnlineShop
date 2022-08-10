package Shop;

public abstract class Human {
    private String name;
    private boolean isEmployee;
    public Human(String name, boolean isEmployee){
        this.name = name;
        this.isEmployee = isEmployee;
    }
    public Human(String name){
        this.name = name;
    }
    public Human(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEmployee() {
        return isEmployee;
    }

    public void setEmployee(boolean employee) {
        isEmployee = employee;
    }
}
