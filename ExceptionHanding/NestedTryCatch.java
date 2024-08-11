package ExceptionHanding;

public class NestedTryCatch {
    public static void main(String[] args) {
        try
        {
            try
            {
                int a=9;
                int b=0;
                System.out.println(a/b);
            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }
            int [] arr = new int[3];
            arr [4]=55;
        }
        catch (Exception e) 
        {
            
            e.printStackTrace();
        }
    }
    
}
