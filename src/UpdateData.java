import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class UpdateData 
{
    public void updateStudentData(String dbName,String tableName,String Id)
    {
        try 
        {
            Connection con = DatabaseConnection.getConnection(dbName);

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the column name: ");
            String columnName = sc.nextLine();

            System.out.println("Enter the value: ");
            String value = sc.nextLine();

            String sql = "UPDATE `" + dbName + "`.`" + tableName +
                "` SET `" + columnName + "` = ? WHERE `Student Id` = ?";

            PreparedStatement pstmt = con.prepareStatement(sql);

            if ("Enrollment Date".equals(columnName)) 
            {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                try 
                {
                    Date parsedDate = dateFormat.parse(value);
                    java.sql.Date sqlDate = new java.sql.Date(parsedDate.getTime());
                    pstmt.setDate(1, sqlDate);
                } 
                catch (ParseException e) 
                {
                    e.printStackTrace();
                }
            } 
            else 
            {
                pstmt.setString(1, value);
            }
            pstmt.setString(2, Id);
        
            pstmt.executeUpdate();
        
            pstmt.close();
            con.close();
            System.out.println("Student data update successfully!");
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }

    public void updateTeacherData(String dbName, String tableName, String Id) 
    {
        try 
        {
            Connection con = DatabaseConnection.getConnection(dbName);
    
            Scanner sc = new Scanner(System.in);
    
            System.out.println("Enter the column name: ");
            String columnName = sc.nextLine();
    
            System.out.println("Enter the value: ");
            String value = sc.nextLine();
    
            String sql = "UPDATE `" + dbName + "`.`" + tableName +
                    "` SET `" + columnName + "` = ? WHERE `Teacher Id` = ?";
    
            PreparedStatement pstmt = con.prepareStatement(sql);
    
            if ("Hire Date".equals(columnName)) 
            {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                try 
                {
                    Date parsedDate = dateFormat.parse(value);
                    java.sql.Date sqlDate = new java.sql.Date(parsedDate.getTime());
                    pstmt.setDate(1, sqlDate);
                } 
                catch (ParseException e) 
                {
                    e.printStackTrace();
                }
            } 
            else 
            {
                pstmt.setString(1, value);
            }
            pstmt.setString(2, Id);
    
            pstmt.executeUpdate();
    
            pstmt.close();
            con.close();
            System.out.println("Teacher data update successfully!");
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
    
}
