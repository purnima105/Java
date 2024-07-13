
//Method Overloading
//without using scanner
public class AreaOfRectSqu
{
    public int Area (int l,int b)
    {
        int rec=l*b;
        return rec;
    }
    public int Area(int l)
    { 
        int sq=l*l;
        return sq;
    }
    public static void main(String[]args)
    {
        AreaOfRectSqu obj= new AreaOfRectSqu();
        int r=obj.Area(5,6);
        int s=obj.Area(5);
        System.out.println("Rectangle = "+r);
        System.out.println("Square = "+s);
        
    }

}
