import java.util.*;
public class areaofRectSquScanner {
    
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
        Scanner sc = new Scanner (System.in);
        areaofRectSquScanner obj= new areaofRectSquScanner();
        System.out.println("Enter the 1st num: ");
        int r=sc.nextInt();
        System.out.println("Enter the 1st num: ");
        int s=sc.nextInt();
        obj.Area(r,s);
        obj.Area(r);
        System.out.println("Rectangle = "+r);
        System.out.println("Square = "+s);
        sc.close();
    }

}

    

