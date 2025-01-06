package FileHandling;

import java.io.*;
public class BufferRead {
    public static void main(String[] args) {
        try
        {
            File f= new File("buffread.txt");
            if (f.createNewFile())
            {
               System.out.println(" file created");
            }
            else
            {
                System.out.println("exist already");
            }

        }
        catch(IOException e)
        {
            System.out.println("error");
        }
        try
        {
           try(BufferedReader fbr = new BufferedReader(new FileReader("buffread.txt")))
           {
               String line;
               while((line=fbr.readLine())!=null)
               {
                   System.out.println(line);
               }
           }
        }
        catch(Exception e)
        {
            System.out.println("file not found");
        }
    }
}
