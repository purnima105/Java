package Interface;
interface i1
{
     void add(int x,int y);
}
interface i2 extends i1{
     void div(int x,int y);
}
class Multi implements i2{
    public void add(int x,int y)
    {
        System.out.println("adding the numbers we get: "+ (x+y));
    }
    public void div(int x,int y)
    {
        System.out.println("dividing the numbers we get: "+(x/y));
    }
}
public class MultiLevelInterface {
    public static void main(String[] args) {
        Multi obj = new Multi();
        obj.add(10, 5);
        obj.div(10, 5);
        

    }
    
}
