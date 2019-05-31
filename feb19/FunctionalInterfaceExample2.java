package feb19;

@FunctionalInterface
interface sayable{
    void say(String msg);   // abstract method
    // It can contain any number of Object class methods.
    int hashCode();
    String toString();
    boolean equals(Object obj);
}
public class FunctionalInterfaceExample2 implements sayable{
    public void say(String msg){
        System.out.println(msg);
    }
    public String toString(String msg){
        System.out.println(msg);
        return msg;
    }
    public static void main(String[] args) {
        FunctionalInterfaceExample2 fie = new FunctionalInterfaceExample2();
        fie.say("Hello there");
        fie.toString("heena");
        fie.hashCode();
    }
}
