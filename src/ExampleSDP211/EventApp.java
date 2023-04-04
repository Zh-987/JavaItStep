package ExampleSDP211;

import java.lang.reflect.Type;

public class EventApp {
    public static void main(String[] args){
        Button tvButton = new Button(new EventHandler() {
            private boolean on = false;
            @Override
            public void execute() {
                if(on){
                    System.out.println("Телевизор выключен");
                    on = false;
                }
                else {
                    System.out.println("Телевизор включен");
                    on = true;
                }
            }
        },Day.Monday, "TV");

        Button printButton = new Button(new EventHandler(){
            public void execute() {
                System.out.println("Запущена печать на принтере");
            }
        },Day.Tuesday,"Print");

        tvButton.click();
        printButton.click();
        tvButton.click();
        System.out.println(printButton.weekdayType);
        System.out.println("--------------------------");
        Day[] days = Day.values();
        for (Day i: days){
            System.out.println(i);
        }
        System.out.println("--------------------------");
        System.out.println(Day.Tuesday.ordinal());

        System.out.println("--------------------------");

        System.out.println(Color.GREEN.getCode());
        System.out.println("--------------------------");

        Operation op = Operation.SUM;
        System.out.println(op.action(3,4));
        op = Operation.MULTIPLY;
        System.out.println(op.action(6,4));

        System.out.println("--------------------------");
        System.out.println(printButton.toString());
        System.out.println(tvButton.toString());

        System.out.println("--------------------------");
        System.out.println(tvButton.hashCode());

        System.out.println("--------------------------");
        System.out.println(tvButton.getClass());

        System.out.println("--------------------------");
        System.out.println(tvButton.equals(tvButton));
    }
}

//values()  ordinal()

class ButtonClick implements EventHandler{
    public void execute(){
        System.out.println("Кнопка нажата");
    }
        }

interface EventHandler{
    void execute();
}

class Button{
    private String name;
    Day weekdayType;
    EventHandler handler;
    Button(EventHandler action, Day type, String name){
        this.handler = action;
        this.weekdayType = type;
        this.name=name;
    }
    public void click(){
        handler.execute();
    }
    /*public void weekDay(Type type){

    }*/
    @Override
    public String toString(){
        return "Device: " + name;
    }
    @Override
    public int hashCode(){
        return 10 * name.hashCode() + 20123;
    }
    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Button)) return false;

        Button bt = (Button) obj;
        return this.name.equals(bt.name);
    }
}
enum Day {
    Monday,
    Tuesday,
    Wednesday,
    Thursday
}

enum Color {
   RED("#FF0000"), GREEN("#0000FF"), BLUE("#00FF00");
   private String code;
    Color(String code){
        this.code = code;
    }
    public String getCode(){
        return code;
    }
}

enum Operation{
    SUM{
        public int action(int x, int y){
            return x+y;
        }
    },
    SUBTRACT{
        public int action(int x, int y){
            return x-y;
    }},
    MULTIPLY{
        public int action(int x, int y){
            return x*y;
        }
    };

    public abstract int action(int a, int b);
}
