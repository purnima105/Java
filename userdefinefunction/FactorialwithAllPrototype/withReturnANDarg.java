package FactorialwithAllPrototype;

import java.util.Scanner;

public class withReturnANDarg 
{
    public static int facto(int num)
    {
       int i,fact=1;
        for(i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[]args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the value of n: ");
        int n = sc.nextInt();
        int fac= facto(n);
        System.out.println("The factorial is = "+ fac);
        sc.close();
    }
    
}
