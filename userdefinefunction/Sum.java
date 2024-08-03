//sum of two integer using user defined function
import java.util.*;
public class Sum {
    public static int SumCall(int x,int y)
    {
        int z=x+y;
        return z;
    }

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st number: ");
        int a= sc.nextInt();
        System.out.println("enter the 2nd number: ");
        int b= sc.nextInt();
        int s=SumCall(a,b);
        System.out.println("the sum is ="+s);
        sc.close();

    }
    
}
