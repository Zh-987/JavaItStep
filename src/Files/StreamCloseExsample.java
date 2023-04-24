package Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StreamCloseExsample {
    public static void main(String args[]) {
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("C://Users//assai//IdeaProjects//untitled//ItStep.txt");
            int i =-1;
            while ((i=fin.read())!=-1){
                System.out.print((char) i);
            }

        }
        catch (IOException e) {
           System.out.println(e.getMessage());
        }
        finally{
            try {
                if(fin!= null)
                    fin.close();
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
