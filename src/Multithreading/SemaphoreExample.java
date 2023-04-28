package Multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main (String[] args) {
        Semaphore semaphore = new Semaphore(1);
        CommonResource2 resource2 = new CommonResource2();
        new Thread(new CountThread2(resource2, semaphore, "Count Thread1")).start();
        new Thread(new CountThread2(resource2, semaphore, "Count Thread1")).start();
        new Thread(new CountThread2(resource2, semaphore, "Count Thread1")).start();
    }
}

class CommonResource2{
    int x =0;
}

class CountThread2 implements Runnable{
    CommonResource2 res;
    Semaphore s;
    String name;
    CountThread2(CommonResource2 res, Semaphore sem, String name){
        this.res = res;
        this.s = sem;
        this.name = name;
    }
    public void run(){
        try {
            System.out.println(name+"acquire permits");
            s.acquire();
            res.x = 1;
            for (int i = 0; i<5; i++){
                System.out.println(this.name + ":" + res.x);
                res.x++;
                Thread.sleep(100);
            }
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println(name+"release permits");
        s.release();
    }
}

