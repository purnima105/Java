import java.io.*;

public class BufferedWrite {
    public static void main(String[] args) {
        try
        {
            File f= new File ("abc.txt");
            if(f.createNewFile())
            {
                System.out.println("file successfully made");
            }
            else
            {
                System.out.println("fail to create file");
            }
        }
        catch(IOException e)
        {
            System.out.println("error ");
        }
        try(BufferedWriter b=new BufferedWriter(new FileWriter("abc.txt")))
        {
            b.write("hello");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }

    }
}
