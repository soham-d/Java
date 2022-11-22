package com.amazon.atlas22.railwaycrossingapp.db;

import com.amazon.atlas22.railwaycrossingapp.model.RailwayCrossing;
import com.amazon.atlas22.railwaycrossingapp.model.User;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBaseBuilder;
import com.opencsv.CSVReaderBuilder;

import javax.sound.midi.Soundbank;
import java.io.*;
import java.sql.*;
import java.util.LinkedHashMap;
import java.util.List;
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

        //code to fetch admins from DB here

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


    public boolean setDB(Object object) throws ClassNotFoundException {
        try {
            // 1. Load the Driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //System.out.println("1. Driver Loaded...");
            String url = "jdbc:sqlserver://localhost:1433;" +
                    "databaseName=railwayApp; user=java2;password=java; integratedSecurity=false;" +
                    "encrypt=true;trustServerCertificate=true";
            // 2. Create the Connection
            Connection connection = DriverManager.getConnection(url);
            //System.out.println("2. Connection Created..");

            if(object instanceof User) {
                // 3. Execute SQL Statement
                User user = (User) object;

                String sql = "INSERT INTO users (user_name,user_email,password,user_type) VALUES (?, ?, ?, ?)";

                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, user.getName());
                statement.setString(2, user.getEmail());
                statement.setString(3, user.getPassword());
                statement.setInt(4, 1);

                // executeUpdate method is used for Insert, Update and Delete
                int i = statement.executeUpdate();
                if (i > 0) {
                    System.out.println("User created successfully [IN DATABASE]");
                } else {
                    System.out.println("User creation failed [IN DATABASE]");
                }
                connection.close();
                return true;
            }else {
                //railway crossing
                // 3. Execute SQL Statement
                RailwayCrossing crossing = (RailwayCrossing) object;

                //insert into railway_crossings(crossing_name,crossingInchargeID, crossing_status, crossing_address, crossing_schedule)
                //values ('Madhuban Colony','inc1@gov.in',1,'Madhuban Colony, Noida', '7:00, 8:34, 12:45, 15:33, 19:05, 21:01');

                String sql = "INSERT INTO railway_crossings (crossing_name,crossingInchargeID, crossing_status, crossing_address, crossing_schedule) VALUES (?, ?, ?, ?,?)";

                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, crossing.getName());
                statement.setString(2, crossing.getPersonInCharge().getEmail());
                statement.setInt(3, crossing.getStatus());
                statement.setString(4, crossing.getAddress());
                statement.setString(5,crossing.getSchedules().toString());

                // executeUpdate method is used for Insert, Update and Delete
                int i = statement.executeUpdate();
                if (i > 0) {
                    System.out.println("Railway Crossing created successfully");
                } else {
                    System.out.println("Railway crossing creation failed");
                }
                connection.close();

                return true;
            }

        } catch (Exception e) {
            System.out.println("Something Went Wrong: "+e);
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

    public void deleteCrossingDB(String crossing_name) throws SQLException {
        try {
            // 1. Load the Driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //System.out.println("1. Driver Loaded...");
            String url = "jdbc:sqlserver://localhost:1433;" +
                    "databaseName=railwayApp; user=java2;password=java; integratedSecurity=false;" +
                    "encrypt=true;trustServerCertificate=true";
            // 2. Create the Connection
            Connection connection = DriverManager.getConnection(url);
            //System.out.println("2. Connection Created..");
            String sql = "delete from railway_crossings where crossing_name = ?;";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, crossing_name);

            // executeUpdate method is used for Insert, Update and Delete
            int i = statement.executeUpdate();
            if (i > 0) {
                System.out.println("Railway Crossing deleted successfully from DATABASE");
            } else {
                System.out.println("Railway crossing creation failed");
            }
            connection.close();


        }catch (Exception e) {
            System.out.println("Something Went Wrong: "+e);

        }
    }


    public boolean deleteDB(Object object) throws ClassNotFoundException {
        try {
            // 1. Load the Driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //System.out.println("1. Driver Loaded...");
            String url = "jdbc:sqlserver://localhost:1433;" +
                    "databaseName=railwayApp; user=java2;password=java; integratedSecurity=false;" +
                    "encrypt=true;trustServerCertificate=true";
            // 2. Create the Connection
            Connection connection = DriverManager.getConnection(url);
            //System.out.println("2. Connection Created..");

            if(object instanceof User) {
                // 3. Execute SQL Statement
                User user = (User) object;

                String sql = "delete from users where user_email = ?;";

                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, user.getEmail());

                // executeUpdate method is used for Insert, Update and Delete
                int i = statement.executeUpdate();
                if (i > 0) {
                    System.out.println("User deleted successfully [IN DATABASE]");
                } else {
                    System.out.println("User deletion failed [IN DATABASE]");
                }
                connection.close();
                return true;
            }else {
                //railway crossing
                // 3. Execute SQL Statement
                RailwayCrossing crossing = (RailwayCrossing) object;

                String sql = "delete from railway_crossings where crossing_name = ?;";

                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, crossing.getName());

                // executeUpdate method is used for Insert, Update and Delete
                int i = statement.executeUpdate();
                if (i > 0) {
                    System.out.println("Railway Crossing deleted successfully from DATABASE");
                } else {
                    System.out.println("Railway crossing creation failed");
                }
                connection.close();

                return true;
            }

        } catch (Exception e) {
            System.out.println("Something Went Wrong: "+e);
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


    public void retrieveCrossingsFromDB(){
        try {
            // 1. Load the Driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //System.out.println("1. Driver Loaded...");
            String url = "jdbc:sqlserver://localhost:1433;" +
                    "databaseName=railwayApp; user=java2;password=java; integratedSecurity=false;" +
                    "encrypt=true;trustServerCertificate=true";
            // 2. Create the Connection
            Connection connection = DriverManager.getConnection(url);
            //System.out.println("2. Connection Created..");

                //railway crossing

            String sql = "SELECT * FROM railway_crossings";

            Statement statement = connection.createStatement();


            // executeQuery -> works with Select Statement
			ResultSet set = statement.executeQuery(sql);

            System.out.println("Crossing Name \t Crossing In-charge \t Crossing Status \t Crossing Address \t Crossing Schedule");
            System.out.println();

			while(set.next()) {
                System.out.print(set.getString("crossing_name") + "\t\t");
                System.out.print(set.getString("crossingInchargeID") + "\t\t");
                System.out.print((set.getInt("crossing_status")==1)?"Open\t\t" : "Closed\t\t");
                System.out.print(set.getString("crossing_address") + "\t\t");
                System.out.print(set.getString("crossing_schedule") + "\t\t");
                System.out.println();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                //connection.close();
            }
            connection.close();


        } catch (Exception e) {
            System.out.println("Something Went Wrong: "+e);
        }

    }

    public void searchCrossingInDB(String CrossingName){
        try {
            // 1. Load the Driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //System.out.println("1. Driver Loaded...");
            String url = "jdbc:sqlserver://localhost:1433;" +
                    "databaseName=railwayApp; user=java2;password=java; integratedSecurity=false;" +
                    "encrypt=true;trustServerCertificate=true";
            // 2. Create the Connection
            Connection connection = DriverManager.getConnection(url);
            //System.out.println("2. Connection Created..");

            //railway crossing

            String sql = "SELECT * FROM railway_crossings where crossing_name = ?;";

            //String sql = "delete from railway_crossings where crossing_name = ?;";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, CrossingName);


            // executeQuery -> works with Select Statement

            ResultSet set = statement.executeQuery();

            if (!set.next()){
                System.out.println("Crossing not found in DataBase");
            }else {
                System.out.println("Crossing found");
                while (set.next()){
                    System.out.print(set.getString("Crossing Name") + "\t");
                    System.out.print(set.getString("Crossing In-Charge ID") + "\t");
                    System.out.print(set.getString("Crossing Status") + "\t");
                    System.out.print(set.getString("Crossing Address") + "\t");
                    System.out.print(set.getInt("Crossing Schedule") + "\t");
                    System.out.println();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                }
                connection.close();
            }
        } catch (Exception e) {
            System.out.println("Something Went Wrong: "+e);
        }

    }

    public int getUserCount(){
        return users.size();
    }

    public int getCrossingsCount(){
        return crossings.size();
    }

    public void exportFromDB(){

        String csvPath = "./export.csv";
        try {
            // 1. Load the Driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //System.out.println("1. Driver Loaded...");
            String url = "jdbc:sqlserver://localhost:1433;" +
                    "databaseName=railwayApp; user=java2;password=java; integratedSecurity=false;" +
                    "encrypt=true;trustServerCertificate=true";
            // 2. Create the Connection
            Connection connection = DriverManager.getConnection(url);
            //System.out.println("2. Connection Created..");

            //railway crossing

            String sql = "SELECT * FROM railway_crossings";

            Statement statement = connection.createStatement();

            // executeQuery -> works with Select Statement

            ResultSet set = statement.executeQuery(sql);
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(csvPath));

            fileWriter.write("crossing_name,crossingInchargeID, crossing_status, crossing_address, crossing_schedule");

            while(set.next()){
                String crossingName = set.getString("crossing_name");
                String crossingInchargeID = set.getString("crossingInchargeID");
                Integer crossing_status = set.getInt("crossing_status");
                String crossing_address = set.getString("crossing_address");
                String crossing_schedule = set.getString("crossing_schedule");

                String line = String.format("%s,%s,%d,%s,%s",crossingName, crossingInchargeID, crossing_status, crossing_address, crossing_schedule);

                fileWriter.newLine();
                fileWriter.write(line);
            }
            System.out.println("Export Completed Successfully...");
            statement.close();
            connection.close();
            fileWriter.close();

        } catch (Exception e) {
            System.out.println("Something Went Wrong, Export Failed: "+e);
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

    public void importFromCSV(){

        //crossing_name	crossingInchargeID	 crossing_status	 crossing_address	 crossing_schedule

        // read file

        try{

            File file = new File("./import.csv");
            String[] files = file.list();

            FileReader fileReader = new FileReader(file);

            CSVReader csvReader = new CSVReaderBuilder(fileReader).withSkipLines(1).build();

            List<String[]> allData = csvReader.readAll();

            CSVReader reader = new CSVReaderBuilder(new FileReader(file)).withSkipLines(1).build();
            String [] nextLine;
            int lineNumber = 1;

            // Extract data from CSV file
            while ((nextLine = reader.readNext()) != null) {

                try {

                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

                    String url = "jdbc:sqlserver://localhost:1433;" +
                    "databaseName=railwayApp; user=java2;password=java; integratedSecurity=false;" +
                    "encrypt=true;trustServerCertificate=true";

                    Connection connection = DriverManager.getConnection(url);

                    //Prepare Query using preparedStatement()
                    String sql = "INSERT INTO railway_crossings (crossing_name,crossingInchargeID, crossing_status, crossing_address, crossing_schedule) VALUES (?, ?, ?, ?,?)";

                    PreparedStatement statement = connection.prepareStatement(sql);
                    statement.setString(1, nextLine[0]);
                    statement.setString(2, nextLine[1]);
                    statement.setInt(3, Integer.parseInt(nextLine[2]));
                    statement.setString(4, nextLine[3]);
                    statement.setString(5, nextLine[4]);
                        // executeUpdate method is used for Insert, Update and Delete
                    int i = statement.executeUpdate();
                    if (i > 0) {
                        System.out.println("Row #"+lineNumber+" inserted");
                    }
                    connection.close();

                }catch (Exception e){
                    System.out.println("Something went wrong..."+e);
                }

            }

        } catch (Exception e){
            e.printStackTrace();

        }

    }


}
