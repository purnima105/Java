import java.util.Scanner;
public class NOreturnNOargs
{
    public void display() // no return -void 
    {                       //no argument
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the two number :\n");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The difference is = "+(a-b));
        sc.close();
    }
    public static void main(String[]args)
    {
        NOreturnNOargs obj= new NOreturnNOargs();
        obj.display();
    }
}