import java.io.*;
import java.io.IOException;

public class ReadingIntoFile {
    public static void main(String[] args) {
        //creating file
        try
        {
            File f= new File("readfile.txt");
            if (f.createNewFile())
            {
                System.out.println("file created sucesfully");
            }
            else
            {
                System.out.println("already exists");
            }
        }
        catch(IOException e)
        {
            System.out.println("error");
        }
//writing into file
    try
    {
        FileWriter fw= new FileWriter("readfile.txt");
        try
        {
        fw.write("hello");
        }
        finally
        {
            fw.close();
        }
    }
    catch(Exception e)
    {
        System.out.println("error");
    }
//reading from file
    try {
        FileReader fr= new FileReader("readfile.txt");
        try
        {
            int i;
            while((i = fr.read())!=-1)
            {
                System.out.println((char)i);
            }
        }
        finally
        {
            fr.close();
        }
    }
    catch(Exception e)
    {
        System.out.println(e);
    }

}
}
