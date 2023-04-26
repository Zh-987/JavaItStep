package Multithreading;

public class ThreadExample {
    public static void main (String[] args){
       /* Thread thread = Thread.currentThread();
        System.out.print(thread);*/
        System.out.println("Main thread started....");

        new JThread("JThread").start();

        System.out.println("Main thread finished...");
    }
}

class JThread extends Thread{
    JThread(String name){
        super(name);
    }

    public void run(){
        System.out.printf("%s started... \n", Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException e){
            System.out.println("Thread has been interaupted");
        }
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}

