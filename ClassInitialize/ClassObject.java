//initializing class attributes using class object 
package ClassInitialize;

public class ClassObject 
{
    public String name;
    public int id;
    public void display()
    {
        System.out.println("Name="+name);
        System.out.println("ID="+id);
    }
    public static void main(String[]args)
    {
        ClassObject obj =new ClassObject();
        obj.name="purnima";
        obj.id=11;
        obj.display();

    }
}

