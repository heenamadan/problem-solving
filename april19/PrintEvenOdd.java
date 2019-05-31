package april19;

public class PrintEvenOdd implements Runnable{

    public int MAX=20;
    static int  num=1;
    int remainder;
    static Object lock=new Object();

    PrintEvenOdd(int remainder)
    {
        this.remainder=remainder;
    }

    @Override
    public void run() {
        while (num < MAX) {
            synchronized (lock) {
                while (num % 2 != remainder) { // wait for numbers other than remainder
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " -->  " + num);
                num++;
                lock.notifyAll();
            }
        }
    }
}