package ExceptionHanding;

public class ArithmeticExceptionss {
    public static void main(String[] args) {
        try
        {
            int a=5;
            int b=0;
            int div=a/b;
            System.out.println(div);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error :  "+e.toString());
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("Handled");
    }
    
}
