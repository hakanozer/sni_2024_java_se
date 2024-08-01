package _11_days;

import java.util.ArrayList;

import _11_days.entities.Customer;

public class MainApp {
    public static void main(String[] args) {

        CustomerService customerService = new CustomerService();

        //Customer addCustomer = new Customer(0, "Erkan", "Bilirler", "erkan@mail.com", "12345");
        //int addStatus = customerService.customerAdd(addCustomer);
        //System.out.println("addStatus: " + addStatus);

        int deleteStatus = customerService.customerDelete(3);
        System.out.println("deleteStatus: " +deleteStatus);

        Customer customer = new Customer(2, "Serkan", "Bilsin", "serkan@mail.com", "12345");
        int updateStatus = customerService.customerUpdate(customer);
        System.out.println("updateStatus: " + updateStatus);

        Customer loginCustomer = customerService.customerLogin("kaan@mail.com", "12345");
        if (loginCustomer == null) {
            System.out.println("Email or Password Fail");
        }else {
            System.out.println("Login Success: " + loginCustomer);
        }

        ArrayList<Customer> ls = customerService.customerAll();
        for (Customer item : ls) {
            System.out.println(item);
        }

    }
}
