public class Activity {

    String activityName;
    int duration;

    public Activity(String activityName,int duration)
    {
        this.activityName=activityName;
        this.duration=duration;
    }

    public double caloriesBurned()
    {
        return duration*6.5;
    }

}