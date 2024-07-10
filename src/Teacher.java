import java.util.*;

public class Teacher 
{
    Scanner sc = new Scanner(System.in);

    public void createDatabase()
    {
        try 
        {
            System.out.println("Enter database name: ");
            String dbName = sc.nextLine();
            CreateDatabase cd = new CreateDatabase();
            cd.createDB(dbName);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    public void createTable()
    {
        try 
        {
            System.out.println("Enter database name: ");
            String dbName = sc.nextLine();
            System.out.println("Enter table name: ");
            String tableName = sc.nextLine();
            CreateTable ct = new CreateTable();
            ct.createTeacherTable(dbName,tableName);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    public void insertData() 
    {
        try 
        {
            System.out.println("Enter database name: ");
            String dbName = sc.nextLine();
            System.out.println("Enter table name: ");
            String tableName = sc.nextLine();
            InsertData insertData = new InsertData();
            insertData.insertTeacherData(dbName, tableName);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    public void readData() 
    {
        try 
        {
            System.out.println("Enter database name: ");
            String dbName = sc.nextLine();
            System.out.println("Enter table name: ");
            String tableName = sc.nextLine();
            ReadData readData = new ReadData();
            readData.readTeacherData(dbName, tableName);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    public void deleteData()
    {
        try 
        {
            System.out.println("Enter database name: ");
            String dbName = sc.nextLine();
            System.out.println("Enter table name: ");
            String tableName = sc.nextLine();
            System.out.println("Enter teacher id: ");
            String teacherId = sc.nextLine();
            DeleteData deleteData = new DeleteData();
            deleteData.deleteTeacherData(dbName, tableName, teacherId);    
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    public void updateData()
    {
        try 
        {
            System.out.println("Enter database name: ");
            String dbName = sc.nextLine();
            System.out.println("Enter table name: ");
            String tableName = sc.nextLine();
            System.out.println("Enter teacher id: ");
            String teacherId = sc.nextLine();
            UpdateData updateData = new UpdateData();
            updateData.updateTeacherData(dbName, tableName, teacherId);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
