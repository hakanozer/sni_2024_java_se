package _11_days;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB {

    final private String driver = "org.h2.Driver";
    final private String url = "jdbc:h2:file:~/sni_2024_java_se";
    final private String username = "sa";
    final private String password = "sa";

    private Connection connection = null;

    public DB() {
        try {
            connection = conn();
            String sql = "CREATE TABLE if not exists customer (\n" + //
                                "id        bigint  auto_increment NOT NULL,\n" + //
                                "name      VARCHAR(50)  NOT NULL,\n" + //
                                "surname   VARCHAR(50)  NOT NULL,\n" + //
                                "email     VARCHAR(50)  NOT NULL,\n" + //
                                "password  VARCHAR(50)  NOT NULL,\n" + //
                                "CONSTRAINT person_pk PRIMARY KEY (id)\n" + //
                                ");";
            PreparedStatement pre = connection.prepareStatement(sql);
            pre.executeUpdate();
            close();
        } catch (Exception e) {
            System.err.println("Table Create Error: " + e);
        }
    }

    public Connection conn() {
        try {
            if (connection == null || connection.isClosed()) {
                Class.forName(driver);
                connection = DriverManager.getConnection(url, username, password);
                System.out.println("Connection Success");
            }
        } catch (Exception e) {
            System.err.println("Connection Error: " + e);
        }
        return connection;
    }

    public void close() {
        try {
            if(connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("close success");
            }
        } catch (Exception e) {
            System.err.println("Close Error: " + e);
        }
    }

}
