package FebPractice;

public class OddEvenRunnable1 implements Runnable {

    int max=10;
    static int min=1;
    int rem=0;
    static Object lock=new Object();

    OddEvenRunnable1(int rem){
        this.rem=rem;

    }
    @Override
    public void run(){
        while(min<max){
            synchronized (lock){
                while(min%2!=rem ){
                    try{
                        lock.wait();
                    }catch (Exception ie){}
                }

                    System.out.println(Thread.currentThread().getName());
                min++;
                lock.notifyAll();

            }
        }


    }
}
