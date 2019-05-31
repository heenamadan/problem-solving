package feb19;

public class heenamadansync {

    Object heena = new Object();
    Object madan = new Object();

    public static void main(String[] args) throws InterruptedException {

        while(true){
            Runnable runnableHeena= new Runnable() {
                @Override
                public void run() {
                    new heenamadansync().printHeena();

                }
            };
            Runnable runnableMadan= new Runnable() {
                @Override
                public void run() {
                    new heenamadansync().printMadan();
                }
            };
            Thread t1 =new Thread(runnableHeena);
            Thread t2 =new Thread(runnableMadan);
            t1.start();
            t1.join();
            t2.start();
            t2.join();

        }



    }

    public void printHeena(){
        synchronized (heena) {
            System.out.println("hello heena");
        }
    }

    public void printMadan(){
        synchronized (madan) {
            System.out.println("hello madan");
        }
    }
}
