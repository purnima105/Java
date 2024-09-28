package Abstarct_class;

abstract class Demo
{
    abstract void f1();
    public void f2()
    {
        System.out.println("This is concrete method.");
    }
}
class Demo2 extends Demo
{
    public void f1()
    {
        System.out.println("This is an abstract method ");
    }

}
public class AbstarctDemo 
{
    public static void main(String[] args) {
        Demo2 obj=new Demo2();
        obj.f1();
        obj.f2();
    }
    
}
