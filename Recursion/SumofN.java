package Recursion;

public class SumofN {
    public int sum(int n)
    {
        if (n>0)
        {
            return n+sum(n-1);
        }
        else
        {
            return 0;
        }
    }
    public static void main(String[] args) {
        SumofN obj =new SumofN();
        int s=obj.sum(5);
        System.out.println(s);
    }
    
}
