package String;
import java.util.Scanner; 
public class StringMethod {
    public static void main(String[] args) {
        //intializaing myself
        char t[]={'a','b'};
        System.out.println(t);
      
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the string: ");
        String a=sc.nextLine();
        String b=sc.nextLine();
        String c= sc.nextLine();
        String d=sc.nextLine();
        sc.close();
      
        //finding the length
        System.out.println("a length is ="+a.length());
      
        //comparing using equalsssssssss
        System.out.println(a.equals(b));  //abc (true)
        System.out.println(b.equals(c));  //abc(false)
        System.out.println(c.equals(d));  //ddd(false)
        System.out.println(d.equalsIgnoreCase(a)); //ABC(true)
        //comapring using compareToooo
        System.out.println(a.compareTo(b));  //0
        System.out.println(b.compareTo(c));  //-3
        System.out.println(c.compareTo(d));  //35
        System.out.println(d.compareToIgnoreCase(a)); //0
         //concatination
        String e=a+b;
        System.out.println("concating using +"+e);
        System.out.println("concating using method:"+b.concat(c));
        //empty or not
        String e1="";
        String e2="not empty";
        System.out.println("empty is : "+e1.isEmpty());
        System.out.println("not empty is :  "+e2.isEmpty());
        //trim
        System.out.println(a.trim()+"hello");
        System.out.println(a.trim()+b);
        //LOWERCASE to UPPERCASE
        System.out.println(d.toLowerCase()); 
        //UPPERCASE to LOWERCASE
        System.out.println(c.toUpperCase());

        //Character extraction
        System.out.println(a.charAt(1));
    }
          
}
