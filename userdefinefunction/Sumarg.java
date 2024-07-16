public class Sumarg 
{
public int sum (int a, int b)
{
return (a + b);
}
public int sum(int a ,int b ,int c)
{
return (a+ b+ c);
}
public static void main(String[] args )
{
Sumarg obj=new Sumarg();
int sum1=obj.sum(5,5);
int sum2=obj.sum(5,6,9);
System.out.println("The sum of 2 is :"+sum1);
System.out.println("The sum of 3 is :"+sum2);
}
}

 



