package ExceptionHanding;

public class MultipleTryCatch {
    public static void main(String[] args) {
       try
       {
            int a=6;
            int b=0;
            System.out.println(a/b);
       }
        catch (ArithmeticException e )
        {
            System.out.println(e);
        }
        try
        {
            int [] arr = new int[3];
            arr [4]=55;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            
            e.printStackTrace();
        }
        System.out.println("Handled");

        
        
    }
    
}
