package March19;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicTest implements Runnable {

    public static CyclicBarrier cyclicBarrier= new CyclicBarrier(3);

    public void run(){

        System.out.println("gfg");

        try{
            cyclicBarrier.await();

        }catch(InterruptedException |BrokenBarrierException be){
            be.printStackTrace();

        }

    }

    public static void main(String args[]) {
        Thread t1=new Thread(new CyclicTest());
        Thread t2=new Thread(new CyclicTest());

        t1.start();
        t2.start();
        System.out.println("foo");

        try{
            cyclicBarrier.await();

        }catch(InterruptedException |BrokenBarrierException be){
            be.printStackTrace();

        }
        System.out.println("end");
    }
}
