package Files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderSample {
    public static void main(String args[]){
        try(FileReader reader = new FileReader("ItStep.txt")){
            char[] bufer = new char[256];
          int i;
          while ((i=reader.read(bufer))>0){
              if(i<256){
                  bufer = Arrays.copyOf(bufer,i);
              }
              System.out.print(bufer);
          }

        }
        catch (IOException e){
            System.out.print(e.getMessage());
        }
    }
}
