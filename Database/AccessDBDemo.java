package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccessDBDemo {
    public static void main(String[] args) {
        // Specify the full path to your Access database file
        String dbPath = "C:/Users/shoab/Downloads/Database11.accdb";
        String url = "jdbc:ucanaccess://" + dbPath; // Use the full path in the URL.

        try {
            Connection connection = DriverManager.getConnection(url);
            // Your database operations here
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
