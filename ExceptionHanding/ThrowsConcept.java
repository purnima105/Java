package ExceptionHanding;

public class ThrowsConcept {
    int division(int a, int b) throws ArithmeticException
        {
            int div=a/b;
            return div;
        }
    public static void main(String[] args) {
        ThrowVoting obj =new ThrowVoting();
        try 
        {
            System.out.println(obj.division(15,0));
        }
        catch(ArithmeticException e )
        {
            System.out.println("Cannot divide number by zero");
        }
    }
    
}
