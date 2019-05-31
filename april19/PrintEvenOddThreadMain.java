package april19;

public class PrintEvenOddThreadMain {
    public static void main(String[] args) {

        PrintEvenOdd runnable1=new PrintEvenOdd(1);
        PrintEvenOdd runnable2=new PrintEvenOdd(0);

        Thread t1=new Thread(runnable1,"Thread 1");
        Thread t2=new Thread(runnable2,"Thread 2");

        t1.start();
        t2.start();
    }
}



