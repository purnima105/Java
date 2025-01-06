import java.util.*;
public class dowhileloop{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the name: ");
        String name = sc.nextLine();
        int i=1;
        do{
            System.out.println(name);
            i++;
        }while(i<5);


    }
}