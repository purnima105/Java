package ClassMaGareko;

class MainClass 
{
    public static void display()
    {
        System.out.println("This is Multiple static method");
        }
        class MultipleStaticMethod1
        {
            public static void display1()
            {
                System.out.println("This is Multi statihffcmethod1");
            }
        }
        public class MultipleStaticMethod 
        {
            public static void main(String[]args)
            {
                MainClass.display();
                MultipleStaticMethod1.display1();         
             }
        }

    
}
