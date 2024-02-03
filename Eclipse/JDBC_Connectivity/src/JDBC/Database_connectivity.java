package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database_connectivity {

    public static void main(String[] args) {
        String url = "jdbc:ucanaccess://D:/Programming/Eclipse/JDBC_Connectivity//data.accdb";

        try (Connection connection = DriverManager.getConnection(url)) {
            System.out.println("Connected successfully");
            String sql = "INSERT INTO Table1 (Name, Roll, Department, Year) VALUES(?,?,?,?)";

            // Insert data into the database
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, "hello6953");
                statement.setInt(2, 1234);
                statement.setString(3, "ICE");
                statement.setInt(4, 2020);

                int rows = statement.executeUpdate();

                if (rows > 0) {
                    System.out.println("New contact Inserted");
                }
            }

            // Retrieve data from the database
            sql = "SELECT * FROM Table1";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                ResultSet result = statement.executeQuery();

                while (result.next()) {
                    String name = result.getString("Name");
                    int roll = result.getInt("Roll");
                    String depart = result.getString("Department");
                    int year = result.getInt("Year");

                    System.out.println(name + " " + roll + " " + depart + " " + year);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
