package Anonymus;

public class Anon {
    static Base createAnon(){
        final int dlocal = 40;

        return new Base(10){
            int bfield = 20;
            int cfiled;
            {
                cfiled = 30;
            }
            int getValue(){
                return afield + bfield + cfiled + dlocal;
            }
        };
    }
    public static void main(String args[]){
        Base anonref = createAnon();

        System.out.println(anonref.getValue());

    }

}

