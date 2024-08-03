package ExceptionHanding;

public class UsingFinally {
    public static void main(String[] args) {
        try
        {
            int a=9;
            int b=0;
            int div=a/b;
            System.out.println(div);
        }
        
        catch (Exception e)
        {
        System.out.println("error"+e.toString());
        e.printStackTrace();
        //System.out.println(e.getMessage());
        }

        finally
        {
            System.out.println("Finallly block executed");
        }
        System.out.println("Handled...");
    }
    
}
