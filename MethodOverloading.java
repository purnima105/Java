class Demo
{
    public int area(int x,int y)
    {
        return(x*y);
    }
    public int area(int x)
    {
        return(x*x);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Demo obj=new Demo();
        int rec=obj.area(5, 6);
        System.out.println("area of rectangle is "+rec);
        int squ=obj.area(7);
        System.out.println("area of square is: "+squ);
    }
    
}








