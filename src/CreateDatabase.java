import java.sql.Statement;
import java.sql.Connection;

public class CreateDatabase
{
    public void createDB(String dbName)
    {
        try 
        {
            Connection connection = DatabaseConnection.getConnection();

            String sql = "CREATE DATABASE IF NOT EXISTS `" + dbName + "`";

            Statement stm = connection.createStatement();
            stm.execute(sql);
            stm.close();
            connection.close();
            System.out.println("Database created successfully!");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
