package Array;

class MyClass
{
    int i;
    public int sumdisplay(int num[])
    {
        int sum=0;
        for(i=0; i<num.length;i++)
        {
           sum= sum + num[i];
        }
        return sum;
    }
    public int productdisplay (int num[])
    {
        int product = 1;
        for(i=0; i<num.length; i++)
        {
            product =num[i]*product;
        }
        return product;
    }
    public int evensumdisplay(int num[])
    {
        int esum=0;
        for(i=0;i<num.length;i++)
        {
            
            if(num[i]%2==0)
            {
                esum=esum+num[i];
            }
        }
        return esum;
    }
}
public class Calculation3 
{
    public static void main(String[]args) 
    {
        
        int dsum, dproduct, desum;
        //int[] num= new int[10];
        MyClass obj=new MyClass();
        int num[]={1,2,3,4,5,6,7,8,9,10};       
       dsum=obj.sumdisplay(num);
       dproduct=obj.productdisplay(num);
       desum=obj.evensumdisplay(num);
       System.out.println("The sum of elements of array are: "+dsum);
       System.out.println("The product of elements are: "+dproduct);
       System.out.println("The sum of even number are: "+desum);

    }
    
}
