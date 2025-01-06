import java.util.*;
public class AddTwoNum
{
    public static int Cal(int x,int y)
    {
        int s;
        s=x+y;
        return s;
    }
    public static void main(String[]args)
    {
        int result;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the 1st number: ");
        int a=sc.nextInt();
        System.out.println("Enter the 2st number: ");
        int b=sc.nextInt();

        //result = Cal (a,b);

        AddTwoNum obj=new AddTwoNum();
        result=obj.Cal(a,b);

        System.out.println("The sum is: "+result);
    }
}