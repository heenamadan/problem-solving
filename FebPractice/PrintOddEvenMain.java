package FebPractice;

public class PrintOddEvenMain {
    public static void main(String[] args) {

        OddEvenRunnable1 oddRunnable=new OddEvenRunnable1(1);
        OddEvenRunnable1 evenRunnable=new OddEvenRunnable1(0);

        Thread t1=new Thread(oddRunnable,"Odd");
        Thread t2=new Thread(evenRunnable,"Even");
        t1.start();
        t2.start();

    }
}
