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
        System.out.println("Name of the product 1"+obj.getName());
        System.out.println("Qty of the product 1 = "+obj.getQty());
        System.out.println("Price of product 1 ="+obj.getPrice());
        System.out.println("Total of the Product= "+obj.getTotal());

        System.out.println("Product 2 :");
        System.out.println("Name of the product 1"+obj1.getName());
        System.out.println("Qty of the product 1 = "+obj1.getQty());
        System.out.println("Price of product 1 ="+obj1.getPrice());
        System.out.println("Total of the Product= "+obj1.getTotal());

      System.out.println("Total of the product ="+obj.getTotal()+obj1.getTotal());
    }
}