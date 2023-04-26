package Files;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class FileSample {
    public static void main(String args[]){
        // C:\Users\assai\Downloads
        File dir = new File("C://Users//assai//Downloads//File.txt");

        System.out.println("File name: "+ dir.getName());
        System.out.println("Parent folder: "+ dir.getParent());

        if(dir.exists()){
            System.out.println("File exists");
        }
        else {
            System.out.println("File not found");
        }
        System.out.println("File size: "+ dir.length());

        if(dir.canRead()){
            System.out.println("File can be read");
        }
        else {
            System.out.println("File can`t be read");
        }
        if(dir.canWrite()){
            System.out.println("File can be written");
        }
        else {
            System.out.println("File can`t be written");
        }

        File newFile = new File("C://Users//assai//Downloads//MyFile");
        try{
            boolean created = newFile.createNewFile();
            if(created){
                System.out.print("The file has been created");
            }
        }
        catch (IOException e){
            System.out.print(e.getMessage());
        }

       /* File dir = new File("C://Users//assai//Downloads//file");
        boolean created = dir.mkdir();
        if(created){
            System.out.print("Folder has been created");
        }
        File newDir = new File("C://Users//assai//Downloads//file");
        dir.renameTo(newDir);

        boolean deleted = newDir.delete();
        if(deleted){
            System.out.print("Folder has been deleted");
        }*/
        /*if(dir.isDirectory()){
            for(File items: dir.listFiles()){
                if(items.isDirectory()){
                    System.out.println(items.getName()+"\t folder");
                }
                else {
                    System.out.println(items.getName()+"\t file");
                }
            }
        }*/
    }
}
