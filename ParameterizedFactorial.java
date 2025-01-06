class Factorial
{
    int num;
    public Factorial(int n)
    {
        num=n;
    }
    public int fact(int n)
    {
        int f=n*fact(n-1);
        return f;
    }

}
public class ParameterizedFactorial {
    public static void main(String[] args) {
    Factorial obj = new Factorial(5);
    int fa=obj.fact(5);
    System.out.println(fa);
    }
    
}
