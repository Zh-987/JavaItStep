package Multithreading;

public class WaitNotifyExample {
    public static void main (String[] args){
        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}

class Store{
    private int product = 0;
    public synchronized void get(){
        while (product<1){
            try {
                wait();
            }
            catch (InterruptedException e){}
        }
        product--;
        System.out.println("The consumer bought an item");
        System.out.println("All the items:"+product);
        notify();
    }
    public synchronized void put(){
        while (product>=3){
            try {
                wait();
            }
            catch (InterruptedException e){}
        }
        product++;
        System.out.println("Producer added 1 item");
        System.out.println("All the items:" + product);
        notify();
    }
}

class Producer implements Runnable{
    Store store;
    Producer(Store store){
        this.store = store;
    }
    public void run(){
        for (int i =0; i<6; i++){
            store.put();
        }
    }
}

class Consumer implements Runnable{
    Store store;
    Consumer(Store store){
        this.store =store;
    }
    public void run(){
        for (int i =0; i<6; i++){
            store.get();
        }
    }
}