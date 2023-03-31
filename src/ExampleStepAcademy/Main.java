package ExampleStepAcademy;

// java.lang, java.io

public class Main {
    public static void main(String[] args) {
      /*  int age;
        char gender;
        String name;
        float height;
        double weight;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name:");
        name = in.nextLine();
        System.out.print("please, Enter your age: ");
        age = in.nextInt();
        System.out.print("please select your gender M or W:");
        gender = in.next().charAt(0);
        System.out.print("Enter your height:");
        height = in.nextFloat();
        System.out.print("Enter your weight:");
        weight = in.nextDouble();

        in.close();

        System.out.printf("name = %s  age = %d  gender = %c   height = %f  weight = %f", name, age, gender, height, weight);*/

        int a = 300;
        byte b = (byte) a;
        System.out.print(b);
        // %f
        // %x
        // %e
        // %c
        // %s
        // %d


        // == !=  < > <= >=  |  & !  ^  && ||    a-d+x     +=  -=  /=  *=  %=


        // if else     if()  else if() else if()  else ()    switch(){ case 1: }    x<y? (x+y) : (x-y)


        // for(int i=0; i<10; i++)
        // do{} while()
        // while(){}

        System.out.println();
        System.out.println();
        int n[];

        n = new int[2];
        int[] n2 = new int[]{1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < n2.length; i++) {
            n2[i] = n2[i] * 2;
            System.out.printf("%d, ", i);
        }

        System.out.println();

        int[] n3 = {1, 2, 3, 4, 5, 5, 6, 7};

        n2[2] = 4;

        int length = n2.length;

        int last = n3[n3.length - 1];

        int[][] n4 = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < n4.length; i++) {
            for (int j = 0; j < n4[i].length; j++) {
                System.out.printf("%d ", n4[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        firstMethod(2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println();
        secondMethod(4, 5);
        System.out.println();
        int x = Sum(3, 4);
        int y = Sum(5, 6);
        System.out.printf("%d %d", x, y);
        System.out.println();


        Car BMW = new Car("Red");
        System.out.println(BMW.getColor());
        BMW.Beep();
        changeColor(BMW);
        System.out.println(BMW.getColor());
    }
    static void changeColor(Car c){
        c = new Car("white");
        c.setColor("blue");
    }
    static void firstMethod(int ...a){
        System.out.println();
        int q = 0;
        for(int i:a){
            q+=i;
            System.out.printf("*** Hello It step , %d", q);
            System.out.println();
        }
       /* System.out.printf("*** Hello It step , %d", a);*/
    }
    static void secondMethod(int c, int d){
        System.out.println();
        System.out.printf("*** Hello It step by method 2 %d %d", c ,d);
    }

    static int Sum(int x, int y){
        return x+y;
    }
}

class Car{
    /*static */private String color/*= "White"*/;

/*    *//*static*//* {
        color = "Red";
    }*/

    Car(String color){
        /*this("Red");*/
        this.color = color;
    }

    public void setColor(String blue){
        this.color = color;
    }
    public String getColor(){
       return this.color;
    }
    public void Beep(){ //final
        System.out.println("Beeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeep");
    }
}

class Brand extends Car{
    public Brand(String color){
        super(color);
    }
    @Override
    public void Beep(){
        System.out.println("Beep Beep Beep");
    }
}

