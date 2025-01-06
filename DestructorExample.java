public class DestructorExample  
{  
    public void finalize()  
{  
System.out.println("Object is destroyed by the Garbage Collector");  
}  
public static void main(String[] args)  
{  
DestructorExample de = new DestructorExample ();  
de.finalize();  
de = null;  
System.gc();  
System.out.println("Inside the main() method");  
}  
}   