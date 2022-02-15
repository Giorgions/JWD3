/*
package pl.edu.wszib.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class FindPersonApp2 {

    private static final String DB_HOST = "morfeusz.wszib.edu.pl";
    private static final String DB_USER = "grlukasa??";
    private static final String DB_PASS = "???";
    private static final String DB_NAME = "AdventureWorks";
    private static final int DB_PORT = 1433;

    private static final String SQL = "SELECT TOP 10 * FROM Person.Contact where LastName like 'Anderson'";

    public static void main(String[] args) {
        FindPersonApp2 fap = new FindPersonApp2();

        try (Connection con = fap.connect();
             Statement stm = con.createStatement();
             ResultSet rs = stm.executeQuery(SQL);
        ) {

            while (rs.next()) {
                System.out.println(rs.getString("FirstName") + " ");
                System.out.println(rs.getString("LastName") + " ");
                System.out.println(rs.getString("EmailAddress"));
            }

        } catch (SQLException e) {
            System.out.println("Wystąpił błąd: " + e.getMessage());
        }

    }

    Connection connect() throws SQLServerException {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(DB_USER);
        ds.setPassword(DB_PASS);
        ds.setServerName(DB_HOST);
        ds.setPortNumber(DB_PORT);
        ds.setDatabaseName(DB_NAME);
        ds.setTrustServerCertificate(true);
        return ds.getConnection();
    }

}
*/
