package SingleCLASSES;

public class Copyconstructor 
{
    public int l,b;
    public Copyconstructor (int x, int y)
    {
        l=x;
        b=y;
        int rec=l*b;
        System.out.println("Area of recctangle is = "+rec);

    }
    public Copyconstructor (Copyconstructor obj)
    {
        int p;
        p=obj.l;
        
        int sq=p*p;
        System.out.println("Area of square is = "+sq);
    }
    public static void main(String[]args)
    {
        Copyconstructor obj1= new Copyconstructor(10,6);
        Copyconstructor obj2= new Copyconstructor (obj1);

    }
    
}
