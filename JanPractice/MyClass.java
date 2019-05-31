package JanPractice;

class Queue {
    private String msg;
    public void setMsg(String m){
        this.msg = m;
    }
    public String getMsg(){
        return this.msg;
    }
}

class Producer implements Runnable {
    private Queue q;
    public Producer (Queue q){
        this.q = q;
    }
    public void run() {

        while (true){
            try{
                synchronized (q){
                    if (q.getMsg () == null) {
                        q.setMsg ("a");
                        System .out.println ("a");
                        q.notify();
                    }else{
                        q.wait();
                    }
                }
            }catch (InterruptedException e){
            }
        }
    }
}

class Consumer implements Runnable {
    private Queue q;
    public Consumer (Queue q){
        this.q = q;
    }
    public void run() {
        while(true){
            try{
                synchronized (q){
                    if (q.getMsg () != null) {
                        q.setMsg (null);
                        System .out.println ("b");
                        q.notify();
                    }else{
                        q.wait();
                    }
                }
            }catch (InterruptedException e){
            }
        }
    }
}

public class MyClass {
    public static void main(String[ ] args) {
        Queue q = new Queue();
        Thread t1 = new Thread(new Producer(q));
        Thread t2 = new Thread(new Consumer(q));
        t1.start();
        t2.start();
    }
}
