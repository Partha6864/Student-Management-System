import java.util.*;

public class Organisation 
{
    public static void main(String[] args) 
    {
        try 
        {
            Scanner sc = new Scanner(System.in);

            Department dpt = new Department();

            while (true) 
            {
                System.out.println("1.Student.\n2.Teacher.\n3.Exit.");

                if (sc.hasNextInt()) 
                {
                    int choice = sc.nextInt();

                    switch (choice) 
                    {
                        case 1:
                            dpt.Student();
                            break;

                        case 2:
                            dpt.Teacher();
                            break;

                        case 3:
                            System.out.println("Exiting the program!");
                            return;

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
