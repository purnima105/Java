import java.util.*;
public class GREATESTof3
{
public static void main (String[]args)
{
Scanner sc=new Scanner(System.in);  
System.out.println("enter the first number");
int a=sc.nextInt();
System.out.println("enter the second number");
int b=sc.nextInt();
System.out.println("enter the third number");
int c=sc.nextInt();
if (a>b&&a>c)
{
System.out.println(a+" is the greater number");
}
else if(b>c)
{
System.out.println(b+" is the greater number");
}
else
{
System.out.println(c+" is the greater number"); 
}
sc.close();
}
}
