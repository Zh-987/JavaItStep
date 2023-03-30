package ExampleSDP211;

import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {  // public, private, protected
    public static void main(String[] args){
        java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(2023,11, 13);

        double result = sqrt(9);

        out.printf("%f",result);

        out.printf("%f",Math.PI);


    }
}

class Math{
    public static final double PI = 3.14;
}
