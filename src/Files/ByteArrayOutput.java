package Files;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteArrayOutput {
    public static void main(String args[]){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String txt = "Hello It STep!!!";
        byte[] buffer = txt.getBytes();
        try {
            baos.write(buffer);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        try(FileOutputStream fos = new FileOutputStream("ItStep.txt")){
            baos.writeTo(fos);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

       /* System.out.println(baos.toString());

        byte[] array = baos.toByteArray();

        for (byte b:array){
            System.out.print((char) b);
        }
        System.out.println();*/
    }
}
