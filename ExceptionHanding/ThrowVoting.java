package ExceptionHanding;

public class ThrowVoting {
    static void votingage(int age)
    {
        if (age<18)
        {
            throw new ArithmeticException("age not valid");
        }
        else
        {
            System.out.println("validddddddd");
        }
    }
    public static void main(String[] args) {
        votingage(13);
        System.out.println("ending");
       
    }
    
}
