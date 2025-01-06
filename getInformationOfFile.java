import java.io.*;
import java.io.IOException;
public class getInformationOfFile {
    public static void main(String[] args) {
        try
        {
            File f=new File("C:\\Users\\ACER GOLD\\Desktop\\getinfo.txt");
            if(f.createNewFile())
            {
                System.out.println("file successfully made");
            }
            else{
                System.out.println("already exists");
            }
            if (f.exists())
            {
                System.out.println("Writable: "+f.canWrite());
                System.out.println("Readable: "+f.canRead());
                System.out.println("Length: "+f.length());
                System.out.println("Name of file : "+f.getName());
                System.out.println("Path : "+f.getAbsolutePath());
                System.out.println(f.delete());
            }
            else
            {
                System.out.println("file doesn't exists");
            }
        }
        catch(IOException e)
        {
            System.out.println("error");
            e.printStackTrace();
        }
    
}
    
}
