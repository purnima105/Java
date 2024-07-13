package MultipleCLASSES;
//package ClassMaGareko;

class MultipleStaticMethod
{
    public static void display()
    {
        System.out.println("This is Multiplestatic method");
    }
    class MultipleStaticMethod1
    {
        public static void display1()
        {
            System.out.println("This is Multistaticmethod1");
        }
    }
    public class mainClass
    {
        public static void main(String[]args)
        {
            MultipleStaticMethod.display();
            MultipleStaticMethod1.display1();          }
    }


}
