package day19;

/*
    Java Database Connectivity (JDBC)

    -> API to connect with DB and execute queries.
    -> Think of JDBC as a translator between Java programs and the
    SQL database.

    Database-independent -> code works with any RDBMS if driver is available.

    JDBC Architecture:
        Application -> JDBC API -> JDBC Driver Manager -> SQL Server

        Oracle, ...

    JDBC API:
        1. java.sql -> Core interfaces and classes are defined.
            Connecting, executing queries and handling result sets.

        2. javax.sql -> Extends functionalities like connection pooling,
        statement pooling and data source management.

    JDBC Driver Types:
    Type 1: JDBC-ODBC Bridge
    Type 2: Native-API Driver
    Type 3: Network Protocol/Middleware Driver
            Java -> Middleware server -> Database
    Type 4: Thin/Pure Java Driver (Mostly used)

    JDBC Steps:
    1. Import JDBC packages.
    2. Load the JDBC driver.
    3. Establish a connection.
    4. Create a statement.
    5. Execute the query.
    6. Process the results.
    7. Close resources.

    executeQuery()
    -> Only for SELECT statements.
    -> Returns a ResultSet.

    executeUpdate()
    -> Returns an int.
    -> insert, update, delete, create, drop.

    execute()
    -> It can execute any SQL statements.
    -> Returns:
        true -> If the result is a ResultSet (usually SELECT).
        false -> If result is an update count (INSERT/UPDATE/DELETE).

    Statement has risk for SQL Injection.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) {
        try {
            // Loading the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/CompanyDB", "root",
                    "hello"
            );

            // Create a statement
            Statement stmt = con.createStatement();

            // Execute the query
            System.out.println("Employee DATA -------------------------");

            ResultSet rs = stmt.executeQuery("SELECT * FROM Employee");
            while(rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("department")
                );
            }

            String insertQuery = "INSERT INTO Employee (name, department, salary, city) " +
                    "VALUES ('Sita', 'Marketing', 48000, 'Birtamode')";

            int rowsInserted = stmt.executeUpdate(insertQuery);
            System.out.println(rowsInserted + " row(s) inserted.");

            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
