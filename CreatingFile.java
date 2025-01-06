package FileHandling;
import java.io.File;
import java.io.IOException;
public class CreatingFile {
    public static void main(String[] args) {
        try
        {
           File f= new File("aalu.txt");
           if(f.createNewFile())
           {
               System.out.println("file created"+f.getName());
           }
           else
           {
            System.out.println("file already exists");
           }
        }
        catch(IOException e)
        {
            System.out.println("an error occur");
            e.printStackTrace();
        }
    }
    
}
