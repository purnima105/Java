/*wap to display all the numbers between -300 to -1 which when divided by 17 
gives -7 as a remainder and also display sum of these number.*/
public class Displaying {
    public static void main(String[] args) {
        int sum=0;
        for(int i=-300;i<=-1;i++)
        {
            System.out.print(i);
            if(i%17==-7)
            {
              sum=sum+i;
            }
        }
       System.out.println(sum);
    }
}