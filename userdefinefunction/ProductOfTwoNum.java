//function to mulitply 2 numbers and return thre product
import java.util.*;
public class ProductOfTwoNum 
{
    public static int pro(int x,int y)
    {
        int p = x*y;
        return p;
    }
    public static void main(String[]args)
    {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int a=sc.nextInt();
        System.out.println("Enter the 2nd number:");
        int b=sc.nextInt();

        int product = pro(a,b);

        System.out.println("The product is "+product);



    }
    
}

