// to print the elements and sum of elements 
package Array;

import java.util.Scanner;
public class TwoD_sum{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int [][] num = new int [2][3];
        int i,j;
        int sum=0;
        System.out.println("Enter the elememts of array: ");

        for(i=0;i<2;i++)
        {
            for (j=0;j<3;j++)
            {
                num[i][j]= sc.nextInt();
                sum=sum+num[i][j];
            }
        }
        System.out.println("The elements entered by user are : ");
        for(i=0;i<2;i++)
        {
            for (j=0;j<3;j++)
            {
                System.out.print("  "+num[i][j]);
            }
            System.out.println("\n");
        }
        System.out.println("The sum of elements entered by user = "+sum);
    }
}
