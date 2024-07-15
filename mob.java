class exam
{
    public String brand;
    public int price;
    public void setValueB(String Brand)
    {
        brand=Brand;
    }
    public void setValueP(int Price)
    {
        price=Price;
    }
    public String getValueB()
    {
        return brand;
    }
    public int getValueP()
    {
        return price;
    }
}
public class mob
{
    public static void main(String[]args)
    {
        exam obj =new exam();
        obj.setValueB=("realme");

       System.out.println(obj.getvalueB());
      
    }
}