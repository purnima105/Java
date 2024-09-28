// wap in java to count the number of words in user inputted string
import java.util.Scanner;
public class CoutingString
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string: ");
        String line=sc.nextLine();
        sc.close();
        System.out.println("The length of the string is :"+line.length());
    }
}