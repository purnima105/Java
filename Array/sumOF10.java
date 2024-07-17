package Array;
import java.util.Scanner;
public class sumOF10
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int i,sum=0;
        int [] num= new int [10];
        for(i=0;i<num.length;i++)
        {
            System.out.println("enter the elements of array: ");
            num[i]=sc.nextInt();
            sum=sum+num[i];
        }
        
        System.out.println("The elements of array are: ");
        for(i=0;i<num.length;i++)
        {
            System.out.print(num[i]+" ");
        }
    }
}