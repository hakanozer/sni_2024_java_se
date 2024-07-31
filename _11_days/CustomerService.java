package _11_days;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerService {
    
    DB db = new DB();

    public int customerAdd( String name, String surname, String email, String password ) {
        int status = 0;
        try {
            String sql = "insert into customer values(default,?,?,?,?)";
            PreparedStatement pre = db.conn().prepareStatement(sql);
            pre.setString(1, name);
            pre.setString(2, surname);
            pre.setString(3, email);
            pre.setString(4, password);
            status = pre.executeUpdate();
        } catch (Exception e) {
            System.err.println("customerAdd error:" + e);
        }finally {
            db.close();
        }
        return status;
    }


    public void customerAll() {
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
                System.out.println(id + "-" + name + "-" + surname + "-" + email + "-" + password);
            }
        } catch (Exception e) {
            System.err.println("customerAll error: " + e);
        }finally {
            db.close();
        }
    }


}
