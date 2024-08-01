package _11_days;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import _11_days.entities.Customer;

public class CustomerService {
    
    private DB db = new DB();

    public int customerAdd( Customer customer ) {
        int status = 0;
        try {
            String sql = "insert into customer values(default,?,?,?,?)";
            PreparedStatement pre = db.conn().prepareStatement(sql);
            pre.setString(1, customer.getName());
            pre.setString(2, customer.getSurname());
            pre.setString(3, customer.getEmail());
            pre.setString(4, customer.getPassword());
            status = pre.executeUpdate();
        } catch (Exception e) {
            System.err.println("customerAdd error:" + e);
        }finally {
            db.close();
        }
        return status;
    }


    public ArrayList<Customer> customerAll() {
        ArrayList<Customer> customeArrayList = new ArrayList<>();
        try {
            String sql = "select * from customer";
            PreparedStatement pre = db.conn().prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while(rs.next()) {
                long id = rs.getLong("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String email = rs.getString("email");
                String password = rs.getString("password");
                Customer customer = new Customer(id, name, surname, email, password);
                customeArrayList.add(customer);
            }
        } catch (Exception e) {
            System.err.println("customerAll error: " + e);
        }finally {
            db.close();
        }
        return customeArrayList;
    }


    public int customerDelete(long id) {
        int status = 0;
        try {
            String sql = "delete from customer where id = ?";
            PreparedStatement pre = db.conn().prepareStatement(sql);
            pre.setLong(1, id);
            status = pre.executeUpdate();
        } catch (Exception e) {
            System.err.println("customerDelete error: " + e);
        }finally {
            db.close();
        }
        return status;
    }

    public int customerUpdate(Customer customer) {
        int status = 0;
        try {
            String sql = "update customer set name = ?, surname = ?, email = ?, password = ? where id = ?";
            PreparedStatement pre = db.conn().prepareStatement(sql);
            pre.setString(1, customer.getName());
            pre.setString(2, customer.getSurname());
            pre.setString(3, customer.getEmail());
            pre.setString(4, customer.getPassword());
            pre.setLong(5, customer.getId());
            status = pre.executeUpdate();
        } catch (Exception e) {
            System.err.println("customerUpdate error: " + e);
        }finally {
            db.close();
        }
        return status;
    }

    public Customer customerLogin(String email, String password) {
        try {
            String sql = "select * from customer where email = ? and password = ?";
            PreparedStatement pre = db.conn().prepareStatement(sql);
            pre.setString(1, email);
            pre.setString(2, password);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                long id = rs.getLong("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                Customer customer = new Customer(id, name, surname, email, password);
                return customer;
            }
        } catch (Exception e) {
            System.err.println("customerLogin error: " + e);
        }finally {
            db.close();
        }
        return null;
    }


}
