package FactorialwithAllPrototype;

import java.util.Scanner;

public class ArgsNOreturn {
    public static void fac(int n)
    {
        int i,fact=1;
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorial is = "+ fact);
    }
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of num: ");
        int num = sc.nextInt();
        fac(num);
        sc.close();
    }
    
}
