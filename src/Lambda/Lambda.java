package Lambda;

public class Lambda {
    public static void main(String args[]){
        /*Operation operation;
        operation = (a,b) -> a+b;
        Operation operation1 = ( a, b) -> a-b;
        Operation operation2 = (a, b) -> a*b;
        Operation operation3 = (a, b) -> a/b;*/
       /* Operation operation4 = a -> a * a;*/


        //int result = operation.calculate(10,20);

     /*   System.out.println(operation.calculate(10,20));
        System.out.println(operation1.calculate(10,20));
        System.out.println(operation2.calculate(10,20));
        System.out.println(operation3.calculate(10,20));*/


        Print print = s -> System.out.println(s);
        print.print("Hello It Step");
    }
}

interface Operation{
   /* int calculate(int a, int b);*/
    int get(int c);
}
interface Print{
    void print(String s);
}

/*

package Lambda;

public class Lambda {
    public static void main(String args[]){
        Operation operation = new Operation() {
            @Override
            public int calculate(int a, int b) {
                return a+b;
            }
        };

        int result = operation.calculate(10,20);

        System.out.println(result);
    }
}

interface Operation{
    int calculate(int a, int b);
}
*/

