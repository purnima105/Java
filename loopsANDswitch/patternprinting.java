import java.util.*;
public class patternprinting{
    public static void main(String[]args){
        int i,j;
        for(i=1;i<=4;i++){
            for(j=i;j<=4;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1;i<=4;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
    }
    //next
    for(i=4;i>=1;i--){
        for(j=1;j<i;j++){
            System.out.print(" ");
        }
        for(int k=0;k<=4-i;k++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}