package March19;

public class Runtest implements Runnable {
    public void run(){
        System.out.println("run");
    }
    public static void main(String args[]) {
        Thread t=new Thread(new Runtest());
t.run();
        t.run();
        t.start();

    }
}
