package FactorialwithAllPrototype;
import java.util.Scanner;
public class NoreturnNoargs 
{
    
    public void fact()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of num: ");
        int num = sc.nextInt();
        int i,fact=1;
        for(i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorial is = "+ fact);    }
    public static void main(String[]args)
    {
        NoreturnNoargs obj =  new NoreturnNoargs();
        obj.fact();
       
    }


    
}
