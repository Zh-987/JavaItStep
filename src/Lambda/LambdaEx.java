package Lambda;

public class LambdaEx {
    static int x = 10;
    static int y = 20;
    public static void main(String args[]){
        Operation2<Integer> operation2 = (x,y) -> x + y;
        Operation2<String> operation3 = (x,y) -> x + y;
        int a = 100;
        int b = 70;
            Calc calculate = (y, z) ->{
                if(y ==0) return 0;
                else return y*z;
            };

            System.out.println(calculate.Sum(10,20));
            System.out.println(calculate.Sum(0,0));
        System.out.println(operation2.calculate(10,20));
        System.out.println(operation3.calculate("10","20"));
    }

}

interface Calc{
    int Sum(int y, int z);
}

interface Operation2<T>{
    T calculate(T x, T y);
}