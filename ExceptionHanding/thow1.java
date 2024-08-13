package ExceptionHanding;


class YoungerAgeException extends RuntimeException{  
    public  YoungerAgeException (String msg)
    {
        super(msg);
    }
}
    public class thow1 {
    public static void main(String[] args) {
        try
        {
            int a=9;
            int b=0;
            System.out.println(a/b);
        }
        catch(Exception e)
        {
            System.out.println("Cannot be divided by zero");
        }
        System.out.println("byeeeeeeeee");
    }  
}
