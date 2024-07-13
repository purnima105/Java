package ClassInitialize;

public class ClassVariableFunction 
{
    public String name;
    public int id;
    public void display( )
    {
        name="purnima ";
        id=12;
        System.out.println("Name="+name);
        System.out.println("Id="+id);
    }
    public static void main(String[]args)
    {
        ClassVariableFunction obj= new ClassVariableFunction();
        obj.display();
    }
    
}
