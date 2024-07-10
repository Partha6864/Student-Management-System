import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReadData 
{
    public void readStudentData(String dbName, String tableName) 
    {
        try 
        {
            Connection con = DatabaseConnection.getConnection(dbName);

            String sql = "SELECT * FROM `" + dbName + "`.`" + tableName + "`";

            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            while (rs.next()) 
            {
                String studentId = rs.getString("Student Id");
                String name = rs.getString("Name");
                int age = rs.getInt("Age");
                String gender = rs.getString("Gender");
                String department = rs.getString("Department");
                String address = rs.getString("Address");
                String contactNumber = rs.getString("Contact Number");
                Date enrollmentDate = rs.getDate("Enrollment Date");

                String formattedEnrollmentDate = dateFormat.format(enrollmentDate);

                System.out.println("Student Id: " + studentId +
                                    "\nName: " + name +
                                    "\nAge: " + age +
                                    "\nGender: " + gender +
                                    "\nDepartment: " + department +
                                    "\nAddress: " + address +
                                    "\nContact Number: " + contactNumber +
                                    "\nEnrollment Date: " + formattedEnrollmentDate);
            }

            stm.close();
            con.close();
            System.out.println("Student data read successfully!");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    public void readTeacherData(String dbName, String tableName) 
    {
        try 
        {
            Connection con = DatabaseConnection.getConnection(dbName);

            String sql = "SELECT * FROM `" + dbName + "`.`" + tableName + "`";

            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            while (rs.next()) 
            {
                String teacherId = rs.getString("Teacher Id");
                String name = rs.getString("Name");
                int age = rs.getInt("Age");
                String gender = rs.getString("Gender");
                String subject = rs.getString("Subject");
                String address = rs.getString("Address");
                String contactNumber = rs.getString("Contact Number");
                Date hireDate = rs.getDate("Hire Date");

                String formattedHireDate = dateFormat.format(hireDate);

                System.out.println("Teacher Id: " + teacherId +
                                    "\nName: " + name +
                                    "\nAge: " + age +
                                    "\nGender: " + gender +
                                    "\nSubject: " + subject +
                                    "\nAddress: " + address +
                                    "\nContact Number: " + contactNumber +
                                    "\nHire Date: " + formattedHireDate);
            }

            stm.close();
            con.close();
            System.out.println("Teacher data read successfully!");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
