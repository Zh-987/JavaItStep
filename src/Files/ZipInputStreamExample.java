package Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipInputStreamExample {
    public static void main(String args[]) {
        try(ZipInputStream zis = new ZipInputStream(new FileInputStream("C:/Users/assai/Downloads/Output.zip"))) {
            ZipEntry zip;
            String name;
            long size;
            while ((zip = zis.getNextEntry())!=null){
                name = zip.getName();
                size = zip.getSize();

                System.out.printf("Name: %s, Size: %d \n", name,size);

                FileOutputStream fous = new FileOutputStream("C:/Users/assai/Downloads/"+name);
                for(int i = zis.read(); i!=-1; i=zis.read()){
                    fous.write(i);
                }
                fous.flush();
                zis.closeEntry();
                fous.close();
            }
        }
        catch (Exception e){
            System.out.print(e.getMessage());
        }
    }
}
