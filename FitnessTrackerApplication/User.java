public class User {

    String name;
    int age;
    double height;
    double weight;

    public User(String name,int age,double height,double weight)
    {
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;
    }

    public double calculateBMI()
    {
        double h=height/100;

        return weight/(h*h);
    }

}