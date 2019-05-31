package algorithmn;

 class simpledemo  implements  Runnable{

    private Thread t;
    private String tname;

    simpledemo(String tname){
        this.tname = tname;

    }

    public  void run(){
        while (true){
            System.out.println(tname);
        }
    }

    public  void start(){

        if(t == null){
            t = new Thread(this, tname);
            t.start();
        }
    }
}

public class TestThread{
    public static void main(String []args) {
        simpledemo a = new simpledemo("a");
        simpledemo b = new simpledemo("b");

        b.start();
        a.start();
    }

}