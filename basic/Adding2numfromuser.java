import java.util.*;
public class Adding2numfromuser {
public void sum() {
Scanner sc=new Scanner (System.in);
System.out.println("enter the number: ");
int a=sc.nextInt();
System.out.println("enter the number: ");
int b=sc.nextInt();
int s=a+b;
System.out.println("The sum is:"+s);
sc.close();
}
public static void main(String[]args)
{
    Adding2numfromuser c1=new Adding2numfromuser();
c1.sum();
}
}


