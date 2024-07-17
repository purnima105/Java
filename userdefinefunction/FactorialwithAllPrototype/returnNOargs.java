package FactorialwithAllPrototype;
import java.util.Scanner;
public class returnNOargs {
    public static int facto()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of num: ");
        int num = sc.nextInt();
        int i,fact=1;
        for(i=1;i<=num;i++)
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
