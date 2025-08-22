package day19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementDemo {
    public static void main(String[] args) {
        // Loading the JDBC driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

             // Establish a connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/CompanyDB", "root",
                "hello"
            );

            String sql = "Insert into Employee (name, department, salary, city)" +
                    "VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            // set parameter values
            ps.setString(1, "Krishna");
            ps.setString(2, "IT");
            ps.setDouble(3, 65000);
            ps.setString(4, "Ktm");

            // Execute
            int rowsInserted = ps.executeUpdate();
            System.out.println(rowsInserted + " row(s) inserted using PreparedStatement.");

            // Close the resources
            ps.close();
            con.close();

        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
