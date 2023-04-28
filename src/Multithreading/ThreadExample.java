package Multithreading;

public class ThreadExample {
    public static void main (String[] args){
       /* Thread thread = Thread.currentThread();
        System.out.print(thread);*/
        System.out.println("Main thread started....");
        JThread t = new JThread("JThread");
        t.start();
        try{
           // t.join();
            Thread.sleep(50);
            t.interrupt();
            Thread.sleep(100);
        }
        catch (InterruptedException e){
            System.out.printf("%s has been interrupted",t.getName());
        }
        System.out.println("Main thread finished...");
    }
}

class JThread extends Thread{
    JThread(String name){
        super(name);
    }

    public void run(){
        System.out.printf("%s started... \n", Thread.currentThread().getName());
        int counter = 1;
        while (!isInterrupted()){
            System.out.println("Loop" + counter++);
      /*  try {
            Thread.sleep(500);
        }
        catch (InterruptedException e){
            System.out.println("Thread has been interaupted");
        }*/
        }
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}

