package Interface;


interface i1
{
    public void f1();
    public void f2();
}
class TestInterface implements i1 {
    public void f1()
    {
        System.out.println("f1() abstract method ");
    }
    public void f2()
    {
        System.out.println("f2() abstract method");
    }
}
public class SingleLevelInterface {
    public static void main(String[] args) {
        TestInterface obj = new TestInterface();
        obj.f1();
        obj.f2();
    }
    
}
