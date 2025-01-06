import java.util.*;
public class GreatestofPositiveNum {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first positive number");
        int a=sc.nextInt();
        System.out.println("Enter the second positive number: ");
        int b=sc.nextInt();
        if(a>0&&b>0) 
        {
            if (a>b) 
            {
                System.out.println(a+" is the greater number");
            }
            else 
            {
                System.out.println(b+" is the greatest");
            }

        }
        else 
        {
            System.out.println("not entered the positive number");
        }
        sc.close();
    }

}