public class Report {

    public static void display(User user,Activity activity)
    {

        System.out.println("\n============== FITNESS REPORT ==============");

        System.out.println("Name      : "+user.name);
        System.out.println("Age       : "+user.age);
        System.out.println("Height    : "+user.height+" cm");
        System.out.println("Weight    : "+user.weight+" kg");

        System.out.printf("BMI       : %.2f\n",user.calculateBMI());

        if(activity!=null)
        {

            System.out.println("Workout   : "+activity.activityName);
            System.out.println("Duration  : "+activity.duration+" Minutes");

            System.out.printf("Calories Burned : %.2f kcal\n",activity.caloriesBurned());

        }

        else
        {
            System.out.println("Workout : No Workout Recorded");
        }

        System.out.println("============================================");

    }

}