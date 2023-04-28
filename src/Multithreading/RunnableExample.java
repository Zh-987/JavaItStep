package Multithreading;

public class RunnableExample  {
    public static void main (String[] args){
        System.out.println("Main thread started....");
       /* Runnable r = ()->{

            System.out.printf("%s strated...\n", Thread.currentThread().getName());
            try{
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                System.out.print("Thread has been interrupted");
            }
            System.out.printf("%s finished...\n", Thread.currentThread().getName());
        };*/
        MyThread myThread = new MyThread();
        Thread t = new Thread(myThread,"MyThread");
        t.start();
        try{
            Thread.sleep(100);
            //myThread.disable();
            t.interrupt();
            Thread.sleep(100);
        }
        catch (InterruptedException e){

        }
        System.out.println("Main thread finished...");
    }
}

class MyThread implements Runnable{
    private boolean isActive;

   /* void disable(){
        isActive = false;
    }
    MyThread(){
        isActive = true;
    }*/
    public void run(){
        System.out.printf("%s strated...\n", Thread.currentThread().getName());
        int counter = 1;

            try {
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.printf("Loop"+counter++);
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
                System.out.println(Thread.currentThread().getName() + " has been interrupted");
                System.out.println(Thread.currentThread().isInterrupted());
                //Thread.currentThread().interrupt();
               /* break;*/
            }
        System.out.printf("%s finished...\n", Thread.currentThread().getName());
        }

    }



