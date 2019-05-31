package JanPractice;

import java.util.HashMap;

public class HashsetDemo extends Thread{

    static HashMap<Integer,String> l=new HashMap<Integer,String>();
    public static void main(String[] args) throws InterruptedException {
        HashsetDemo d= new HashsetDemo();
        l.put(100,"A");
        l.put(101,"B");
        l.put(102,"C");
        d.start();

        for (Object o : l.entrySet())
        {
            Object s=o;
            System.out.println(s);
            Thread.sleep(1000);
        }
        System.out.println(l);

    }

    public void run(){
        l.put(103,"D");

        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Child Thread going to add element");
        }

    }
}
