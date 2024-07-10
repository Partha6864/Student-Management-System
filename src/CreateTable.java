import java.sql.Connection;
import java.sql.Statement;

public class CreateTable
{
    public void createStudentTable(String dbName, String tableName) 
    {
        try 
        {
            Connection connectionWithDB = DatabaseConnection.getConnection(dbName);

            String sql = "CREATE TABLE IF NOT EXISTS `" + dbName + "`.`" + tableName + "` (" +
                         "`Sl. No.` INT AUTO_INCREMENT PRIMARY KEY," +
                         "`Student Id` VARCHAR(5) UNIQUE NOT NULL," +
                         "`Name` VARCHAR(255) NOT NULL," +
                         "`Age` INT NOT NULL," +
                         "`Gender` VARCHAR(10) NOT NULL," +
                         "`Department` VARCHAR(255) NOT NULL," +
                         "`Address` VARCHAR(255) NOT NULL," +
                         "`Contact Number` VARCHAR(15) NOT NULL," +
                         "`Enrollment Date` DATE NOT NULL" +
                         ")";

            Statement stm = connectionWithDB.createStatement();
            stm.execute(sql);
            stm.close();
            connectionWithDB.close();
            System.out.println("Table created successfully!");        
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    public void createTeacherTable(String dbName, String tableName) 
    {
        try 
        {
            Connection connectionWithDB = DatabaseConnection.getConnection(dbName);

            String sql = "CREATE TABLE IF NOT EXISTS `" + dbName + "`.`" + tableName + "` (" +
                         "`Sl. No.` INT AUTO_INCREMENT PRIMARY KEY," +
                         "`Teacher Id` VARCHAR(5) UNIQUE NOT NULL," +
                         "`Name` VARCHAR(255) NOT NULL," +
                         "`Age` INT NOT NULL," +
                         "`Gender` VARCHAR(10) NOT NULL," +
                         "`Subject` VARCHAR(255) NOT NULL," +
                         "`Address` VARCHAR(255) NOT NULL," +
                         "`Contact Number` VARCHAR(15) NOT NULL," +
                         "`Hire Date` DATE NOT NULL" +
                         ")";

            Statement stm = connectionWithDB.createStatement();
            stm.execute(sql);
            stm.close();
            connectionWithDB.close();

            System.out.println("Table created successfully!");
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
