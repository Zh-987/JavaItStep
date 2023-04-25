package Files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufWriter {
    public static void main(String args[]){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("ItStep.txt"))){
            String text = "Hello world\n Hey! Teachers! Leave the kids alone.";
            bw.write(text);
        }
        catch (IOException e){
            System.out.print(e.getMessage());
        }
    }
}
