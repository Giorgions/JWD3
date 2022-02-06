package pl.edu.wszib.jdbc;

import java.sql.*;

public class MyFirstJdbcConnection {
    public static void main(String[] args) {
        String connectionUrl = "jdbc:sqlserver://morfeusz.wszib.edu.pl:1433;databaseName=AdventureWorks;username=gr???;password=???;trustServerCertificate=true";

        try(Connection con = DriverManager.getConnection(connectionUrl);
            Statement stmt = con.createStatement()) {

            String sql = "SELECT TOP 10 * FROM Person.Contact ORDER BY FirstName";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getString("FirstName") + " " + rs.getString("LastName"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
