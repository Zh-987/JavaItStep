package Files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterSample {
    public static void main(String args[]){
        try(FileWriter writer = new FileWriter("ItStep.txt", false)){
            String text = "Hello Students !!!";
            String text2 = "Hello Students ucss!!!";
            writer.write(text);
            writer.write(text2);

            /*writer.append('\n');
            writer.append('A');*/
            writer.flush();
        }
        catch (IOException e){
            System.out.print(e.getMessage());
        }
    }
}
