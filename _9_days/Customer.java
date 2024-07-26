package _9_days;

public class Customer extends Employe {

    private int customerID;
    public Customer(int customerID) {
        this.customerID = customerID;
    }

    @Override
    int customerID() {
        return customerID;
    }
    
}
