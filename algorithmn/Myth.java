package algorithmn;

public class Myth extends  Thread{
    public static void main(String[] args) {
        Myth t= new Myth();
        t.run();
        t.start();

    }
    public void run(){
        System.out.println("s");
    }
}
