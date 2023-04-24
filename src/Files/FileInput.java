package Files;

import java.io.FileInputStream;

public class FileInput {
    public static void main(String args[]){
        try(FileInputStream fin = new FileInputStream("ItStep.txt")){
            byte[] buffer = new byte[256];
            System.out.print("File data:");
            int i;
            while ((i= fin.read(buffer))!=-1){
                for (int j =0; j<i; j++ ){
                    System.out.print((char)buffer[j]);
                }

            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
