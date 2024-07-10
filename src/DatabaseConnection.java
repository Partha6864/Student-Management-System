import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection 
{
    private static final String urlWithoutDB = "jdbc:mysql://localhost:3306/?useSSL=false";
    private static final String urlWithDBTemplate = "jdbc:mysql://localhost:3306/%s?useSSL=false";
    private static final String userName = "root";
    private static final String password = "Partha@6864";

    public static Connection getConnection() throws SQLException 
    {
        return DriverManager.getConnection(urlWithoutDB, userName, password);
    }

    public static Connection getConnection(String dbName) throws SQLException 
    {
        String fullUrl = String.format(urlWithDBTemplate, dbName);
        return DriverManager.getConnection(fullUrl, userName, password);
    }
}
