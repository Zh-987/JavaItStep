package Files;

import java.io.*;

public class BufReader {
    public static void main(String args[]){
        try(BufferedReader br = new BufferedReader(new FileReader("ItStep.txt")) ){
            String s;
            //int i;
            while ((s=br.readLine())!=null){
                System.out.println(s);
            }
        }
        catch (IOException e){
            System.out.print(e.getMessage());
        }
    }
}
