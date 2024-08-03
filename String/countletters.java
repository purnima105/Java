
package String;

public class countletters
{
    public static void main(String[]args)
    {
        String fullname = "purnima   ";
        int i;
        int count =0;

        for (i=0; i<fullname.length(); i++)
        {
            System.out.print(" "+fullname.charAt(i));
        }                                 

        for (i=0; i<fullname.length(); i++)
        {
            if (fullname.charAt(i)!=' ')
            {
            count =count+i;
            
            }
        }
        System.out.println(count);
       
        
    }
}