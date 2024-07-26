package _9_days;

public abstract class Employe {
    
    abstract int customerID();

    public String name() {
        int id = customerID();
        String nameSurname = "";
        if (id == 100) {
            nameSurname = "Erkan Bilsin";
        }else if (id == 200 ) {
            nameSurname = "Zehra Bil";
        }
        return nameSurname;
    }

    public int total() {
        int id = customerID();
        int customerTotal = 0;
        if (id == 100) { 
            customerTotal = 1000000;
        }else if (id == 200 ) { 
            customerTotal = 2000000;
        }
        return customerTotal;
    }

}
