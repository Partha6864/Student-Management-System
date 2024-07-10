import java.util.*;

public class Department 
{
    public void Student()
    {
        try 
        {
            Scanner sc = new Scanner(System.in);

            Student st = new Student();

            while (true) 
            {
                System.out.println("1.Create database.\n2.Create table.\n3.Insert Data.\n4.Read Data.\n5.Delete Data.\n6.Update Data.\n7.Exit.");

                if (sc.hasNextInt()) 
                {
                    int choice = sc.nextInt();

                    switch (choice) 
                    {
                        case 1:
                            st.createDatabase();
                            break;

                        case 2:
                            st.createTable();
                            break;

                        case 3:
                            st.insertData();
                            break;

                        case 4:
                            st.readData();
                            break;

                        case 5:
                            st.deleteData();
                            break;

                        case 6:
                            st.updateData();
                            break;

                        case 7:
                            System.out.println("Exiting the program!");
                            System.exit(0);;

                        default:
                            System.out.println("Invalid choice.");
                            continue;
                    }
                }
                else
                {
                    System.out.println("Please enter a number.");
                    sc.next();
                }
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    public void Teacher()
    {
        try 
        {
            Scanner sc = new Scanner(System.in);

            Teacher th = new Teacher();

            while (true) 
            {
                System.out.println("1.Create database.\n2.Create table.\n3.Insert Data.\n4.Read Data.\n5.Delete Data.\n6.Update Data.\n7.Exit.");
                
                if (sc.hasNextInt()) 
                {
                    int choice = sc.nextInt();

                    switch (choice) 
                    {
                        case 1:
                            th.createDatabase();
                            break;

                        case 2:
                            th.createTable();
                            break;

                        case 3:
                            th.insertData();
                            break;

                        case 4:
                            th.readData();
                            break;

                        case 5:
                            th.deleteData();
                            break;

                        case 6:
                            th.updateData();
                            break;

                        case 7:
                            System.out.println("Exiting the program!");
                            System.exit(0);

                        default:
                            System.out.println("Invalid choice.");
                            continue;
                    }
                }
                else
                {
                    System.out.println("Please enter a number.");
                    sc.next();
                }
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
