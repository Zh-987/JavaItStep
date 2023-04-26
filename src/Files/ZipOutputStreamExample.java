package Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamExample {
    public static void main(String args[]) {
        String filename = "C:/Users/assai/Downloads/File.txt";
        try(ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("C:/Users/assai/Downloads/Output.zip"));
            FileInputStream fis = new FileInputStream(filename);)
        {
            ZipEntry entry = new ZipEntry("File.txt");
            zos.putNextEntry(entry);

            byte[] buffer = new byte[fis.available()];

            fis.read(buffer);

            zos.write(buffer);

            zos.closeEntry();
        }
        catch (Exception e){
            System.out.print(e.getMessage());
        }
    }
}
