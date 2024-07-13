import java.util.Scanner;
public class NOreturnNOargs
{
    public void sum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("The sum is : "+sum);
    }
    //object banaune 
    public static void main(String[]args)
    {
        NOreturnNOargs obj1= new NOreturnNOargs();
        obj1.sum();
        
    }
}