/**
 * Created by heena.madan on 27/07/17.
 */
public class CountJob extends Thread {

    int counter;

    public void run(){
        synchronized (this){
            for(int i=0;i<10000;i++){
                counter++;
            }
            this.notify();
            System.out.println("completed.....");
        }

    }

    public static void main(String args[]) throws InterruptedException{
        CountJob countJob  = new CountJob();
        countJob.start();
        Thread.sleep(10000);
        System.out.println("waiting....");
        synchronized (countJob){
            countJob.wait();
        }
        System.out.println(countJob.counter);

    }

}

//completed.....
//waiting.... infinit lop
