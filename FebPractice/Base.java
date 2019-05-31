package FebPractice;

public class Base {

    /*public Object sum(){
        System.out.println("hello");
        return null;
    }*/

    static int i=2;
    Base(){
        System.out.println(i++);
    }

    public static void hello(){
        System.out.println("hmm");
    }
    public String sum(){
        System.out.println("child");
        return "hena";
    }

}
