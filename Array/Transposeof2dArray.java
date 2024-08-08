package Array;
import java.util.Scanner;
public class Transposeof2dArray {
    

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the size of row: ");
        int row = sc.nextInt();
        System.out.println("Enter the size of column : ");
        int column = sc.nextInt();
        int [][] num = new int [row][column];
        int i,j;
        
        System.out.println("Enter the elememts of array: ");

        for(i=0;i<num.length;i++)
        {
            for (j=0;j<num.length;j++)
            {
                num[i][j]= sc.nextInt();
                
            }
        }
        System.out.println("The elements entered by user : ");
        for(i=0;i<num.length;i++)
        {
            for (j=0;j<num.length;j++)
            {
                System.out.print("  "+num[i][j]);
            }
            System.out.println("\n");
        }
        System.out.println("The transpose of elements : ");
        for(i=0;i<num.length;i++)
        {
            for (j=0;j<num.length;j++)
            {
                System.out.print("  "+num[j][i]);
            }
            System.out.println("\n");
        }
       
    }
}

    

