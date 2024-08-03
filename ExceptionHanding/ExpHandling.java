package ExceptionHanding;

public class ExpHandling {
    public static void main(String[] args) {
        try
        {
            int a=5;
            int b=0;
            int div=a/b;
            System.out.println(div);
        }
        catch (Exception e)
        {
            System.out.println("Error :  "+e.toString());
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("Handled");

    }
}
    

