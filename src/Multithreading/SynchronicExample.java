package Multithreading;

public class SynchronicExample {
    public static void main (String[] args){
        CommonResource commonResource = new CommonResource();
        for (int i =0; i<6; i++){
            Thread t = new Thread(new CountThread(commonResource));
            t.setName("Thread"+i);
            t.start();
        }
    }
}

class CommonResource{
    int x;
    synchronized void increment(){
        x=1;
        for(int i = 1; i<5; i++){
            System.out.printf("%s %d \n", Thread.currentThread().getName(),x);
            x++;
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e){

            }
        }
    }
}
class CountThread implements Runnable{
    CommonResource res;
    CountThread(CommonResource r){
        this.res = r;
    }
    public void run(){
        res.increment();
      /*  synchronized (res){
       res.x=1;
       for(int i = 1; i<5; i++){
           System.out.printf("%s %d \n", Thread.currentThread().getName(),res.x);
           res.x++;
           try {
               Thread.sleep(100);
           }
           catch (InterruptedException e){

           }
       }*/
        }
    }
//}
