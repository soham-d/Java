import java.sql.*;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

class ConnectURL {
    void connect() {
        // Create a variable for the connection string.
        //String connectionUrl = "jdbc:sqlserver://;serverName=localhost;databaseName=TestDB;user=sa;password=SHEEr@z786";
        String connectionUrl =
                "jdbc:sqlserver://localhost:1433;" +
                        "databaseName=sample; user=sa;password=SHEEr@z786; integratedSecurity=true;" +
                        "encrypt=true;trustServerCertificate=true";
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {

            String SQL = "SELECT * FROM userTable";
            ResultSet rs = stmt.executeQuery(SQL);

            // Iterate through the data in the result set and display it.
            while (rs.next()) {
                System.out.println("Name: " + rs.getString("Name") + ", " + rs.getString("Email"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
