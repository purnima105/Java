package FileHandling;

import java.io.*;
public class WritingInFile {
    public static void main(String[] args) {
        try
        {
        FileWriter f=new FileWriter("file.txt");
        try{
            f.write("helloooooo javaaaaaaa");
        }
        finally
        {
            f.close();
        }
        System.out.println("sucessfully written");
        }
        catch(IOException e)
        {
            System.out.println("error");
        }
    }
    
}
