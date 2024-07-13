package SingleCLASSES;

public class ParametrizedConstructor 
{
    public String name;
    public String course;
    public int roll_no;
    public  ParametrizedConstructor (String Name, String Course, int Roll_no)
    {
        name=Name;
        course=Course;
        roll_no=Roll_no;
        System.out.println("Name: "+name +"\n"+"Course: "+course +"\n"+"Roll_No: "+roll_no);
    }
    public static void main(String[]args)
    {
        ParametrizedConstructor obj1 = new ParametrizedConstructor("Purnima Gupta","BIM",23);
        System.out.println("\n");
        ParametrizedConstructor obj2 = new ParametrizedConstructor("Jay Raj Agrawal","BIM",14);

    }
    
}
