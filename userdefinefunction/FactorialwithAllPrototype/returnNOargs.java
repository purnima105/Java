package FactorialwithAllPrototype;
import java.util.Scanner;
public class returnNOargs {
    public static int facto()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n = sc.nextInt();
        sc.close();
        int i,fact=1;
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
        
    }
    public static void main(String[]args)
    {
        int fac=facto();
        System.out.println("The factorial is = "+ fac);

    }
    
}
