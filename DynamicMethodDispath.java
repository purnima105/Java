class A
{
    public void fun()
    {
        System.out.println("Inside class A");
    }
}
class B extends A
{
    public void fun()
    {
        System.out.println("Inside class B");
    }
}
class C extends A
{
    public void fun()
    {
        System.out.println("Inside class C");
    }
}
public class DynamicMethodDispath {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();
        A ref;
        ref= obj1;
        ref.fun();
        ref=obj2;
        ref.fun();
        ref=obj3;
        ref.fun();
    }
    
}
