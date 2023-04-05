package ExampleSDP211;

public class Account<T> /*implements Accountable */{
    private T id;
   /* private int sum;*/
    Account(T id/*, int sum*/){
        this.id = id;
        /*this.sum = sum;*/
    }

    public T getId(){return id;}
   /* public int getSum(){return sum;}
    public void setSum(int sum){this.sum = sum;}*/

}

class DepositAccount<T> extends Account<T>{
    /*private T id;
    T getId(){return id;}*/
    DepositAccount(T id){
        super(id);/*
        this.id = id;*/
       /* this.name = name;*/
    }
}
/*
class Transaction<T extends Account & Accountable>{
    private T from;
    private T to;
    private int sum;

    Transaction(T from, T to, int sum){
        this.from = from;
        this.to = to;
        this.sum = sum;
    }

    public void execute(){
        if(from.getSum() > sum){
            from.setSum(from.getSum() - sum);
            to.setSum(to.getSum() + sum);
            System.out.printf("Account %s: %d \n Account %s: %d \n", from.getId(),from.getSum(),to.getId(), to.getSum());
        }
        else {
            System.out.println("Operation is invalid. Sum of the cash in your account not enough !!!");
        }
    }

}

interface Accountable{
    String getId();
     int getSum();
    void setSum(int sum);
}*/

