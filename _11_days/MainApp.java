package _11_days;

public class MainApp {
    public static void main(String[] args) {

        CustomerService customerService = new CustomerService();
        //int status = customerService.customerAdd("Leyla", "Bilirler", "leyla@mail.com", "12345");
        //System.out.println(status);

        customerService.customerAll();

    }
}
