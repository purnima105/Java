package SingleCLASSES;

public class Defaultconstructor 
{
    public String name;
    public String course;
    public  Defaultconstructor()
    {
        name = "Purnima Gupta";
        course="BIM";
        System.out.println("Name: "+name);
        System.out.println("Course: "+course);
    }
    public static void main(String[]args)
    {
        Defaultconstructor obj1 = new Defaultconstructor();
        Defaultconstructor obj2 = new Defaultconstructor();

    }
}
