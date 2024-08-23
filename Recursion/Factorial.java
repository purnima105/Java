package Recursion;

public class Factorial {
    public int fac(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        else{
            return n*fac(n-1);
        }

    }
    public static void main(String[] args) {
        Factorial obj = new Factorial();
        int f=obj.fac(5);
        System.out.println(f);
    }
    
}
