package JanPractice;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {



    public static void main(String args[]) {

        CyclicBarrier cb = new CyclicBarrier(3, new Runnable() {
            @Override
            public void run() {
                System.out.println("All are done ... CyclicBarrier Over now ....Lets enjoyee.");
            }
        });

        Thread t1= new Thread(new Task(cb));
        Thread t2= new Thread(new Task(cb));
        Thread t3= new Thread(new Task(cb));
        t1.start();
        t2.start();
        t3.start();


    }
}

class Task implements Runnable{
    CyclicBarrier cyclicBarrier;
    Task(CyclicBarrier cyclicBarrier){
        this.cyclicBarrier= cyclicBarrier;
    }


    public  void run(){
        try{
            System.out.println(Thread.currentThread().getName() +"is going to await----");
            cyclicBarrier.await();
            System.out.println(Thread.currentThread().getName() +"is crossed the barrier----");
        }catch (Exception ie){}

    }
}
