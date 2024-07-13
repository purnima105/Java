import java.util.*;
public class aalu
{
public static void main (String[]args)
{
Scanner sc=new Scanner(System.in);  
System.out.println("1.Sum");
System.out.println("2.Product");
System.out.println("3.Difference");
System.out.println("enter your choice(1/2/3):> ");
int choice=sc.nextInt();
System.out.println("enter the first number:" );
int a=sc.nextInt();
System.out.println("enter the second number:");
int b=sc.nextInt(); 
switch(choice)
{
case 1:
int sum=a+b;
System.out.println("The sum is "+sum);
break;

case 2:
int product=a*b;
System.out.println("The product is "+product);
break;

case 3:
int difference=a-b;
System.out.println("The difference is "+difference);
break;
default:
System.out.println("Wrong choice");
}
}
}






