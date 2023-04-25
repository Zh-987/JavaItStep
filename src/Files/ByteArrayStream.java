package Files;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteArrayStream {
    public static void main(String args[]){
        byte[] array1 = new byte[]{1,3,5,7,9};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(array1);
        int b;
        while ((b=byteArrayInputStream.read())!=-1){
            System.out.println(b);
        }
        String text = "Hello world!!!";

        byte[] array2 = text.getBytes();

        ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(array2,0,5);
        int c;
        while ((c = byteArrayInputStream1.read())!=-1){
            System.out.print((char)c);
        }


    }

}
