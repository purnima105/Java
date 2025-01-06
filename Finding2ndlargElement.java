import java.util.Scanner;
public class Finding2ndlargElement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] a= new int [10];
        System.out.println("enter the elements: ");
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        int largest=a[0];
        int secondlarg=-1;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>largest)
            {
               largest=a[i];
            }
        }
        System.out.println("1st"+largest);
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=largest)
            {
                if(a[i]>secondlarg)
                {
                secondlarg=a[i];
                }
            }
        }
        System.out.println("2nd"+secondlarg);
        sc.close();
    }
}
