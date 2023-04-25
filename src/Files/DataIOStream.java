package Files;

import javax.imageio.IIOException;
import java.io.*;

public class DataIOStream {
    public static void main(String args[]) {
        Person Tom = new Person("Tom", 20,1.80, false);

        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin"))) {
            dos.writeUTF(Tom.name);
            dos.writeInt(Tom.age);
            dos.writeDouble(Tom.height);
            dos.writeBoolean(Tom.married);
            System.out.print("File has been written");
        }
        catch (IOException e){
            System.out.print(e.getMessage());
        }
        try(DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"))) {
            String name = dis.readUTF();
            int age = dis.readInt();
            double height = dis.readDouble();
            boolean married = dis.readBoolean();
            System.out.printf("Name: %s, Age: %d, Height: %f, Married: %b", name,age,height,married);
        }
        catch (IOException e){
            System.out.print(e.getMessage());
        }
    }
}

class Person{
   public String name;
   public int age;
   public double height;
   public boolean married;

   public Person(String s, int n, double d, boolean b){
       this.name = s;
       this.age = n;
       this.height = d;
       this.married = b;
   }
}