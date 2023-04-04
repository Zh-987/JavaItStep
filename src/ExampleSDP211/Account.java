package ExampleSDP211;

public class Account /*implements Accountable<String>*/ {
    private String id;
    private int sum;
    <T>Account(T id, int sum){
        this.id = id.toString();
        this.sum = sum;
    }

    public String getId(){return id;}
    public int getSum(){return sum;}
    public void setSum(int sum){this.sum = sum;}

}

/*
interface Accountable<T,S>{
    T getId();
    S getSum();
    void setSum(S sum);
}
*/
