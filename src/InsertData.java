import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InsertData 
{

    private static int studentIdCounter = 1;
    private static int teacherIdCounter = 1;

    public void insertStudentData(String dbName, String tableName) 
    {
        try 
        {
            Connection con = DatabaseConnection.getConnection(dbName);

            String studentId = "S" + String.format("%03d", studentIdCounter++);

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter student name:");
            String name = sc.nextLine();

            System.out.println("Enter student age:");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter student gender:");
            String gender = sc.nextLine();

            System.out.println("Enter student department:");
            String department = sc.nextLine();

            System.out.println("Enter student address:");
            String address = sc.nextLine();

            System.out.println("Enter student contact number:");
            String contactNumber = sc.nextLine();

            System.out.println("Enter student enrollment date (DD/MM/YYYY):");
            String enrollmentDateStr = sc.nextLine();

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date enrollmentDate = dateFormat.parse(enrollmentDateStr);

            String sql = "INSERT INTO `" + dbName + "`.`" + tableName + "` " +
                        "(`Student Id`, `Name`, `Age`, `Gender`, `Department`, `Address`, `Contact Number`, `Enrollment Date`) " +
                        "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, studentId);
            pstm.setString(2, name);
            pstm.setInt(3, age);
            pstm.setString(4, gender);
            pstm.setString(5, department);
            pstm.setString(6, address);
            pstm.setString(7, contactNumber);
            pstm.setDate(8, new java.sql.Date(enrollmentDate.getTime()));

            pstm.executeUpdate();

            pstm.close();
            con.close();

            System.out.println("Data inserted successfully!");
        } 
        catch (SQLException | ParseException e) 
        {
            e.printStackTrace();
        }
    }

    public void insertTeacherData(String dbName, String tableName) 
    {
        try 
        {
            Connection con = DatabaseConnection.getConnection(dbName);

            String teacherId = "T" + String.format("%03d", teacherIdCounter++);

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter teacher name:");
            String name = sc.nextLine();

            System.out.println("Enter teacher age:");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter teacher gender:");
            String gender = sc.nextLine();

            System.out.println("Enter teacher subject:");
            String subject = sc.nextLine();

            System.out.println("Enter teacher address:");
            String address = sc.nextLine();

            System.out.println("Enter teacher contact number:");
            String contactNumber = sc.nextLine();

            System.out.println("Enter teacher hire date (DD/MM/YYYY):");
            String hireDateStr = sc.nextLine();

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date hireDate = dateFormat.parse(hireDateStr);

            String sql = "INSERT INTO `" + dbName + "`.`" + tableName + "` " +
                        "(`Teacher Id`, `Name`, `Age`, `Gender`, `Subject`, `Address`, `Contact Number`, `Hire Date`) " +
                        "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, teacherId);
            pstm.setString(2, name);
            pstm.setInt(3, age);
            pstm.setString(4, gender);
            pstm.setString(5, subject);
            pstm.setString(6, address);
            pstm.setString(7, contactNumber);
            pstm.setDate(8, new java.sql.Date(hireDate.getTime()));

            pstm.execute();

            pstm.close();
            con.close();

            System.out.println("Data inserted successfully!");
        } 
        catch (SQLException | ParseException e) 
        {
            e.printStackTrace();
        }
    }
}
