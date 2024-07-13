public class OverLoading 
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
    OverLoading obj=new OverLoading();
int sum1=obj.sum(5,5);
int sum2=obj.sum(5,6,9);
System.out.println("The sum of 2 is :"+sum1);
System.out.println("The sum of 3 is :"+sum2);
}
}

 



