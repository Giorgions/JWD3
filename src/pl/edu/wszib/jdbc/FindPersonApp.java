/*
package pl.edu.wszib.jdbc;

import java.sql.*;

public class FindPersonApp {

    private static final String DB_HOST = "morfeusz.wszib.edu.pl";
    private static final String DB_USER = "grlukasa";
    private static final String DB_PASS = "??";
    private static final String DB_NAME = "AdventureWorks";
    private static final int DB_PORT = 1433;

    private static final String SQL = "SELECT * FROM Person.Contact where LastName like ?";

    public static void main(String[] args) {
        FindPersonApp fap = new FindPersonApp();

        try (Connection con = fap.connect();
             PreparedStatement ps = con.prepareStatement(SQL);
             ) {
            if (args.length == 0) {
                System.out.println("Nie podano nazwiska!");
            } else {
                ps.setString(1,args[0] + "%");
                ResultSet rs = ps.executeQuery();

                if (!rs.next()) {
                    System.out.println("Nie znaleziono żadnych osób!");
                } else {
                    do {
                        System.out.println(rs.getString("FirstName") + " ");
                        System.out.println(rs.getString("LastName") + " ");
                        System.out.println(rs.getString("EmailAddress"));
                    } while (rs.next());


                }
            }


        } catch (SQLServerException e) {
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
