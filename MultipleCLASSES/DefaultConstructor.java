package MultipleCLASSES;


    class Information
    {
    public String name;
    public String course;
    public  Information()
    {
        name = "Purnima Gupta";
        course="BIM";
        System.out.println("Name: "+name);
        System.out.println("Course: "+course);
    }
    }
     class  Info
    {
        public int roll_no;
        public  Info()
    {
        roll_no=23;
        System.out.println("Roll_no: "+roll_no);
        
    }
    }
    public class DefaultConstructor {
    public static void main(String[]args)
    {
        Information obj1 = new Information();
        Info obj2 = new Info();
        
    }
}

    

