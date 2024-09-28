package ExceptionHanding;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedDemo {
    public static void main(String[] args) {
        try
        {
            FileInputStream file = new FileInputStream("hdc.txt");
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.toString());
        }
    }  
}
