package JanPractice;

public class ThreadingClass {

    public static void main(String[ ] args) {
        Q q = new Q();
        Thread t1 = new Thread(new Producer1(q));
        Thread t2 = new Thread(new Consumer1(q));
        t1.start();
        t2.start();
    }
}

class Producer1 implements Runnable{
    Q q;
    Producer1(Q q){
        this.q=q;

    }
    public void run() {
        try {
            while (true) {
                synchronized (q) {
                    if (q.getMsg() == null) {
                        q.setMsg("a");
                        System.out.println("a");
                        q.notify();
                    } else {
                        q.wait();
                    }
                }
            }
        }catch (InterruptedException ie){}

    }
}

class Consumer1 implements Runnable{
    Q q;
    Consumer1(Q q){
        this.q=q;

    }
    public void run() {
        try {
            while (true) {
                synchronized (q) {
                    if (q.getMsg() != null) {
                        q.setMsg(null);
                        System.out.println("b");
                        q.notify();
                    } else {
                        q.wait();
                    }
                }
            }
        }catch (InterruptedException ie){}

    }
}

class Q{
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}



