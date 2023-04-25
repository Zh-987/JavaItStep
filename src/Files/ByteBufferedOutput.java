package Files;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteBufferedOutput {
    public static void main(String args[]){
        String txt = "Hello world !!!";

        try(FileOutputStream out = new FileOutputStream("ItStep.txt");
        BufferedOutputStream bos = new BufferedOutputStream(out);
        ){
            byte[] buffer = txt.getBytes();
            bos.write(buffer, 0,buffer.length);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
