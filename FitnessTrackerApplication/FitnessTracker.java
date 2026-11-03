import java.util.Scanner;

public class FitnessTracker {

    Scanner sc=new Scanner(System.in);

    User user;
    Activity activity;

    public void createUser()
    {

        System.out.print("Enter Name : ");
        String name=sc.next();

        System.out.print("Enter Age : ");
        int age=sc.nextInt();

        System.out.print("Enter Height(cm): ");
        double height=sc.nextDouble();

        System.out.print("Enter Weight(kg): ");
        double weight=sc.nextDouble();

        user=new User(name,age,height,weight);

        System.out.println("User Created Successfully");

    }

    public void addWorkout()
    {

        if(user==null)
        {
            System.out.println("Create User First");
            return;
        }

        System.out.print("Workout Name : ");
        String workout=sc.next();

        System.out.print("Duration(Minutes): ");
        int duration=sc.nextInt();

        activity=new Activity(workout,duration);

        System.out.println("Workout Added");

    }

    public void showReport()
    {

        if(user==null)
        {
            System.out.println("No User Found");
            return;
        }

        Report.display(user,activity);

    }

}