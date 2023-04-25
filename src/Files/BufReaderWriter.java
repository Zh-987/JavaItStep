package Files;

import java.io.*;

public class BufReaderWriter {
    public static void main(String args[]){
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new FileWriter("ItStep.txt"))){
        String s;
        //int i;
        while (!(s=br.readLine()).equals("ESC")){
            bw.write(s + "\n");
            bw.flush();
        }
    }
        catch (IOException e){
        System.out.print(e.getMessage());
    }
}
}
