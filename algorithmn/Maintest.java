
package algorithmn;



class My extends Thread{
    My(){
        System.out.println("MY");
    }
    public void run(){
        System.out.println("bar");
    }
    public void run(String s){
        System.out.println("baz");
    }
}

public class Maintest {
    public static void main(String[] args) {

   Thread t= new My(){
       public void run(){
           System.out.println("foo");
       }
   };
   t.start();
    }}

