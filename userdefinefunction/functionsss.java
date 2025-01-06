import java.util.Scanner;

public class functionsss {
    public static void printMyName(String name){
        System.out.print(name);
        return;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String line=sc.next();
        printMyName(line);
    }
    
}
