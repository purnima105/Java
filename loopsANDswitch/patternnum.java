import java.util.*;
public class patternnum {
    public static void main(String[]args){
        int i;
        int j;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        //next
        System.out.println();
        for(i=1;i<=5;i++){
            for(j=1;j<=5-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        int number=1;
        System.out.println();
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print(number);
                System.out.print(" ");
                number++;
            }
            System.out.println();
        }
        System.out.println();
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                if((i+j)%2==0)
                {
                System.out.print("1");
                System.out.print(" ");
                }
                else if((i+j)%2!=0){
                    System.out.print("0");
                    System.out.print(" ");
                }
            }
            System.out.println();
    }
    
}
}
