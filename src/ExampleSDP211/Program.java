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


       /* Account acc = new Account("cid03029", 50000);
        Account acc2 = new Account(5432, 50000);

        System.out.println(acc.getId());
        System.out.println(acc2.getId());


        Printer print = new Printer();

        String[] people = {"Olga","Alice","Sam","Jhon","Ben"};
        Integer[] numbers = {2,3,4,5,6,7,8,9};

        print.<String>print(people);
        print.<Integer>print(numbers);
*/
        /*Account acc3 = new Account("cid03029", 200000);
        Account acc4 = new Account("5432", 50000);
*/
        DepositAccount<Integer> depacc3 = new DepositAccount(1);


        Account<Integer> acc4 = (Account<Integer>)depacc3;
        System.out.println(acc4.getId() );

  /*      DepositAccount depacc4 = new DepositAccount(02,"Oleg");
        System.out.println(depacc4.getId() + ": " + depacc4.getName());*/
       /* Transaction<Account> tran1 = new Transaction<Account>(acc3,acc4,100000);
        tran1.execute();*/

        /*tran1 = new Transaction<Account<String>>(acc3,acc4,100000);
        tran1.execute();*/
    }
}
