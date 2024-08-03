package CaseStudyQ;
interface num
{
    int add(int x, int y);
    int diff(int x,int y);
}
class Number implements num
{
    public int add(int x,int y) 
    {
        return (x+y);
    }
    public int diff(int x,int y)
    {
        return (x-y);
    }
}

public class InterfaceClass {
    public static void main(String[] args) {
        Number obj = new Number();
        int a=obj.add(5, 6);
        int d=obj.diff(5, 2);
        System.out.println("Add="+a);
        System.out.println("Difference="+d);
    }
    
}
