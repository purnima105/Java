package CaseStudyQ;
class Product
{
    public String Name;
    public int qty;
    public int price;
    public int total;
    public Product(String name,int Qty, int Price)
    {
        Name=name;
        qty=Qty;
        price=Price;

    }
    public String getName()
    {
        return Name;
    }
    
    public int getQty()
    {
        return qty;
    }
    
    public int getPrice()
    {
        return price;
    }
    public int getTotal()
    {
        total=price*qty;
        return total;
    }
}
public class ProductDemo2{
    public static void main(String[]args)
    {
        Product obj =new Product("Dettol",6,100);
        

        Product obj1 =new Product("LUX Soap",4,40);
        

        System.out.println("Product 1 :");
        System.out.println("Name "+obj.getName());
        System.out.println("Qty  = "+obj.getQty());
        System.out.println("Price ="+obj.getPrice());
        System.out.println("Total = "+obj.getTotal());

        System.out.println("Product 2 :");
        System.out.println("Name "+obj1.getName());
        System.out.println("Qty = "+obj1.getQty());
        System.out.println("Price ="+obj1.getPrice());
        System.out.println("Total = "+obj1.getTotal()+"\n");
        
        int  tot=obj.getTotal()+obj1.getTotal();
        System.out.println("Total of both products ="+tot);

    }
}