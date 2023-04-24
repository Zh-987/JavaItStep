package Files;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyCreate {
    public static void main(String args[]){
        try(FileInputStream fin = new FileInputStream("ItStep.txt");
            FileOutputStream fos = new FileOutputStream("NewFile.txt")){

            byte[] buffer = new byte[256];
            System.out.print("File data:");
            int i;
            while ((i= fin.read(buffer))!=-1){
                fos.write(buffer,0, i);
            }
            System.out.println("File has been created and written");
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
