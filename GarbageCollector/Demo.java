package GarbageCollector;

public class Demo {
    public void finalize()
    {
        System.out.println("1");
        System.out.println("2");
    }
    public static void main(String[] args) {
        Demo obj1=new Demo();
        Demo obj2 =new Demo();
        obj1=null;
        obj2=null;
        System.gc();
    }
    
}
