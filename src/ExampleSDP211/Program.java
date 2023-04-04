package ExampleSDP211;

public class Program {
    public static void main (String[] args){
       /* Account<String, Double> acc = new Account<String,Double>("12342rew", 4323.43);
        //Account<String> acc2 = new Account<String>("2123", 1000000); // id - целое число
        String accID = acc.getId();
        Double sum = acc.getSum();
        System.out.printf("ID: %s, SUM: %f \n", accID, sum);*/
        /*System.out.println(acc.getId());
        System.out.println(acc2.getId());*/

        /*Account<Integer> acc2 = new Account<Integer>(21323,99999);// id - строка
        Integer acc2ID = acc2.getId();
        System.out.println(acc2ID);*/


        Account acc = new Account("cid03029", 50000);
        Account acc2 = new Account(5432, 50000);

        System.out.println(acc.getId());
        System.out.println(acc2.getId());


        Printer print = new Printer();

        String[] people = {"Olga","Alice","Sam","Jhon","Ben"};
        Integer[] numbers = {2,3,4,5,6,7,8,9};

        print.<String>print(people);
        print.<Integer>print(numbers);


    }
}
