import java.util.*;
public class Reverse
{
public static void main(String[]args)
{
int sum=0,rem;
Scanner sc=new Scanner(System.in);
System.out.println("enter any number: ");
int num=sc.nextInt();
do
{
rem=num%10;
sum=sum+rem;
num=num/10;
}while(num!=0);

System.out.println("the sum of number is "+sum);
sc.close();
}
}

