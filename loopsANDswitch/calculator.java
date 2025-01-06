/*Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
	1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and display it to the user.*/

import java.util.*;
public class calculator{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();

        int a=sc.nextInt();
        int b=sc.nextInt();

        switch(num){
            case 1:{
                int add=a+b;
                System.out.println(add);
                break;
        }
        case 2: {
            int sub=a-b;
            System.out.println(sub);
            break;
        }
        case 3:{
            int mul=a*b;
            System.out.println(mul);
            break;
        }
        case 4:{
            int div=a/b;
            System.out.println(div);
            break;
        }
        case 5:{
            int rem=a%b;
            System.out.println(rem);
            break;
        }
        default :{
            System.out.println("Invalid number");
        }
        }

    }
}
