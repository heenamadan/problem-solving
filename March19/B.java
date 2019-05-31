package March19;


class A{
    public A(String str){
        System.out.println("A");
    }
    A(){}
}
public class B extends A{

    public B(String str){
        System.out.println("B");
    }

    public static void main(String args[]) {
        new B("C");
    }
}
