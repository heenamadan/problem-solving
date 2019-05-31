package feb19;

public class HelloWorldThread {


    Object hello = new Object();
    Object world = new Object();


    public static void main(String[] args) throws InterruptedException {
        while(true){
            Runnable helloTask = new Runnable(){
                @Override
                public void run(){
                    new HelloWorldThread().printHello();
                }
            };

            Runnable worldTask = new Runnable(){
                @Override
                public void run(){
                    new HelloWorldThread().printWorld();
                }
            };

            Thread t1 = new Thread(helloTask);
            Thread t2 = new Thread(worldTask);
            t1.start();
            t1.join();
            t2.start();
            t2.join();
        }

    }

    public void printHello(){
        synchronized (hello) {
            System.out.println("Hello");
        }
    }

    public void printWorld(){
        synchronized (world) {
            System.out.println("World");
        }
    }
}
