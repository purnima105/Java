package SingleCLASSES;

public class ConstructorOverloading 
{
    public String name;
    public String course;
    public int roll_no;
    public  ConstructorOverloading (String Name, String Course, int Roll_no)
    {
        name=Name;
        course=Course;
        roll_no=Roll_no;
        System.out.println("Name: "+name +"\n"+"Course: "+course +"\n"+"Roll_No: "+roll_no);
    }
    public static void main(String[]args)
    {
        ConstructorOverloading obj1 = new ConstructorOverloading("Purnima Gupta","BIM",23);
        System.out.println("\n");
        ConstructorOverloading obj2 = new ConstructorOverloading("Jay Raj Agrawal","BIM",14);
        
    }   
}
