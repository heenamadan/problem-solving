package feb19;

interface Sayable{
    // Default method
     default void say(){
        System.out.println("Hello, this is default method");
    }

    static void m(){
        System.out.println("static");
    }
    // Abstract method
     void sayMore(String msg);
}
public class DefaultMethods implements Sayable{
    public void sayMore(String msg){        // implementing abstract method
        System.out.println(msg);
    }
    public static void main(String[] args) {
        DefaultMethods dm = new DefaultMethods();
        dm.say();   // calling default method
        dm.sayMore("Work is worship");  // calling abstract method


    }
}
