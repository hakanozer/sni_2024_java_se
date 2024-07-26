package _9_days;

public class MainAbstract {
    public static void main(String[] args) {
        
        Customer customer = new Customer(200);
        System.out.println( customer.name() );
        System.out.println( customer.total() );

        System.out.println("=====================");
        Employe employe = new Employe() {
            @Override
            int customerID() {
                return 100;
            }
        };
        System.out.println( employe.name() );
        System.out.println( employe.total() );

    }
}
