package ExceptionHanding;



class Throw {
    public void fun() throws ArrayIndexOutOfBoundsException,ArithmeticException
    {
       
            int a=10;
            int b=0;
            System.out.println(a/b);
            int [] n =new int [3];
            n[3]=55;
      
    }
}
    public class ThrowsConcept{
    public static void main(String[] args) {
        Throw obj =new Throw();
        try{
            obj.fun();
        }
        
        catch(ArithmeticException e)
        {
            System.out.println("Cannot be divided by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid INDEX");
        }
        finally
        {
            System.out.println("Finally....");
        }
        System.out.println("HANDLEDD");   
    }  
}

