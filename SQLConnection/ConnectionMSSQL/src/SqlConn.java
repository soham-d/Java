
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConn {
    SqlConn(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Driver loaded successfully");
        }catch(Exception e) {
            System.out.println("Unable to load driver.");
        }
    }
    
    void connToDB() {
        try {
            Connection conn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;" +
                    "databaseName=sample; user=java2;password=java; integratedSecurity=false;" +
                    "encrypt=true;trustServerCertificate=true");
            if(conn!=null) {
                System.out.println("Connected to the database...");
            }
            
        } catch (SQLException e) {
            System.out.println("Error connecting to the database...");
            e.printStackTrace();
        }

    }
 
    public static void main(String[] args) {
        SqlConn c= new SqlConn();
        c.connToDB();
    }
}
