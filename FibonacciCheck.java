
import java.util.Scanner;
public class FibonacciCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to input a number
        System.out.print("Enter a number to check if it's a Fibonacci number: ");
        int num = scanner.nextInt();

        // Initial Fibonacci numbers
        int a = 0, b = 1;

        // Check if the number is a Fibonacci number
        while (b < num) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        if (b == num) {
            System.out.println(num + " is a Fibonacci number.");
        } else {
            System.out.println(num + " is not a Fibonacci number.");
        }

        scanner.close();
    }
}
