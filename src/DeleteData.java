import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class DeleteData 
{
    public void deleteStudentData(String dbName,String tableName,String Id)
    {
        try 
        {
            Connection con = DatabaseConnection.getConnection(dbName);
            
            String sql = "DELETE FROM `" + dbName + "`.`" + tableName + "` WHERE `Student Id` = '" + Id + "'";

            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.executeUpdate();

            pstm.close();
            con.close();
            System.out.println("Student data delete successfully!");
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }

    public void deleteTeacherData(String dbName,String tableName,String Id)
    {
        try 
        {
            Connection con = DatabaseConnection.getConnection(dbName);
            
            String sql = "DELETE FROM `" + dbName + "`.`" + tableName + "` WHERE `Teacher Id` = '" + Id + "'";

            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.execute();

            pstm.close();
            con.close();
            System.out.println("Teacher data delete successfully!");
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
}
