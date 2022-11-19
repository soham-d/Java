package com.amazon.atlas22.railwaycrossingapp.db;

import com.amazon.atlas22.railwaycrossingapp.model.RailwayCrossing;
import com.amazon.atlas22.railwaycrossingapp.model.User;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;

public class DB implements DAO{

    LinkedHashMap<String, User> users = new LinkedHashMap<String, User>();
    LinkedHashMap<String, RailwayCrossing> crossings = new LinkedHashMap<String, RailwayCrossing>();
    private static DB db;

    private DB(){
        populateAdminUsers(); // To create admin users

        class SqlConn {
            SqlConn() {
                try {
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    System.out.println("Driver loaded successfully");
                } catch (Exception e) {
                    System.out.println("Unable to load DataBase driver.");
                }
            }

            void connToDB() {
                try {
                    Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;" +
                            "databaseName=sample; user=java2;password=java; integratedSecurity=false;" +
                            "encrypt=true;trustServerCertificate=true");
                    if (conn != null) {
                        System.out.println("Connected to the database...");
                    }
                } catch (SQLException e) {
                    System.out.println("Error connecting to the database...");
                    e.printStackTrace();
                }
            }

        }
        SqlConn c = new SqlConn();
        c.connToDB();
    }

    public static DB getInstance(){
        if(db == null){
            db = new DB();
        }
        return db;
    }

    void populateAdminUsers(){
        User user1 = new User("George", "George@gov.in", "george@123",2);
        User user2 = new User("Hary", "Harry@gov.in", "harry@123",2);

        set(user1);
        set(user2);

        try {

            // 1. Load the Driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("1. Driver Loaded...");

            String url = "jdbc:sqlserver://localhost:1433;" +
                    "databaseName=sample; user=java2;password=java; integratedSecurity=false;" +
                    "encrypt=true;trustServerCertificate=true";


            // 2. Create the Connection
            Connection connection = DriverManager.getConnection(url);
            System.out.println("2. Connection Created..");

            // 3. Execute SQL Statement
            String sql = "insert into users(user_name,password,user_type) values (, 'pass123', 1);
            //String sql = "DELETE FROM Customer WHERE cid = 10";
            //String sql = "UPDATE Customer SET name = 'Mike M', cashBack = 593 WHERE cid = 12";

            //String sql = "SELECT * FROM Customer";

            //Statement statement = connection.createStatement();

			/*
			// executeUpdate method is used for Insert, Update and Delete
			int i = statement.executeUpdate(sql);
			if(i > 0) {
				System.out.println("3. SQL Statement Executed..");
			}else {
				System.out.println("3. SQL Statement Failed...");
			}
			*/

            // executeQuery -> works with Select Statement
			/*ResultSet set = statement.executeQuery(sql);

			while(set.next()) {
				System.out.print(set.getInt("cid")+"\t");
				System.out.print(set.getString("name")+"\t");
				System.out.print(set.getString("phone")+"\t");
				System.out.print(set.getString("email")+"\t");
				System.out.print(set.getInt("cashBack")+"\t");
				System.out.println();
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}*/


            String sql = "INSERT INTO Customer (name, phone, email, cashBack) VALUES (?, ?, ?, ?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, "Pam");
            statement.setString(2, "+91 80808 30303");
            statement.setString(3, "pam@example.com");
            statement.setInt(4, 375);

            int i = statement.executeUpdate();
            if(i > 0) {
                System.out.println("3. SQL Statement Executed..");
            }else {
                System.out.println("3. SQL Statement Failed...");
            }

            //4. Close the Connection
            connection.close();
            System.out.println("4. Connection Closed..");

        } catch (Exception e) {
            System.out.println("Something Went Wrong: "+e);
        }

    }

    public boolean set(Object object){
        // This function performs both insert and update operation on user record.
        if(object instanceof User){
            User user = (User) object;
            users.put(user.getEmail(), user);
            return true;
        }else{
            RailwayCrossing crossing = (RailwayCrossing) object;
            crossings.put(crossing.getPersonInCharge().getEmail(), crossing);
            return true;
        }

    }
    public boolean delete(Object object){
        if(object instanceof User){
            User user = (User) object;
            users.remove(user.getEmail());
            return true;
        }else{
            RailwayCrossing crossing = (RailwayCrossing) object;
            crossings.remove(crossing.getPersonInCharge().getEmail());
            return true;
        }

    }

    public Map<String, ?> retrieve(Object object) {
        if(object instanceof User){
            return users;
        }else{
            return crossings;
        }
    }

    @Override
    public Object retrieve(String key) {
        if(users.containsKey(key)){
            return users.get(key);
        }else if(crossings.containsKey(key)){
            return crossings.get(key);
        }else{
            return null;
        }
    }

    public int getUserCount(){
        return users.size();
    }

    public int getCrossingsCount(){
        return crossings.size();
    }

    public void exportData(){

        try{
            File file = new File(".\\users-data\\");
            if(!file.exists()){
                file.mkdir();
                System.out.println("Directory created by the name of: "+file.getName());
            }
            for(String key: users.keySet()){
                File userFile = new File(".\\users-data\\", key+".txt");
                FileOutputStream stream = new FileOutputStream(file);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(stream);
                objectOutputStream.writeObject(users.get(key));
                System.out.println("User "+key+" Exported...");

            }

            System.out.println("Export Finished Successfully...");

        } catch (Exception e){
            e.printStackTrace();

        }

    }

    public void importData(){

        try{

            File file = new File(".\\users-data\\");
            String[] files = file.list();

            for(String fileName: files){
                File userFile = new File(".\\users-data\\", fileName);
                FileInputStream stream = new FileInputStream(userFile);
                ObjectInputStream objectInputStream = new ObjectInputStream(stream);

                User user = (User) objectInputStream.readObject();

                users.put(user.getEmail(), user);
            }

            System.out.println("Import Finished Successfully...");

        } catch (Exception e){
            e.printStackTrace();

        }

    }
}
