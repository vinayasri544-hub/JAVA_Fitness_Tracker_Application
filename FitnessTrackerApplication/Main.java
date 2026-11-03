import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FitnessTracker tracker = new FitnessTracker();

        int choice;

        do {

            System.out.println("\n==============================");
            System.out.println(" FITNESS TRACKER APPLICATION ");
            System.out.println("==============================");
            System.out.println("1. Create User");
            System.out.println("2. Add Workout");
            System.out.println("3. View Report");
            System.out.println("4. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch(choice)
            {

                case 1:
                    tracker.createUser();
                    break;

                case 2:
                    tracker.addWorkout();
                    break;

                case 3:
                    tracker.showReport();
                    break;

                case 4:
                    System.out.println("Thank You...");
                    break;

                default:
                    System.out.println("Invalid Choice");

            }

        }while(choice!=4);
        sc.close();
    }

}