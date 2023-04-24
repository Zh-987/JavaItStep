package Files;

import java.io.*;

public class FileOutput {
    public static void main(String args[]){
    String text = "Hello world !!!";

    try(FileOutputStream fos = new FileOutputStream("ItStep.txt"))
    {
        byte[] buffer = text.getBytes();
        fos.write(buffer,0, buffer.length); //buffer[0];
        System.out.println("The file has been written");
    }
    catch(IOException ex){
        System.out.println(ex.getMessage());
    }
}
}
