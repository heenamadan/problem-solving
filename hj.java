
interface  A{
    void test();
}
class B implements A{
    public  void test(){
        System.out.println("b");
    }
}
class C implements A{
    public  void test(){
        System.out.println("c");
    }public  void chk(){
        System.out.println("chk");
    }

}
public class hj extends B {
    public static void main(String[] args) {
        A a= new hj();
        B b= new hj();

        A c= new C();
        a.test();
        b.test();
        c.test();
        ( (C)c).chk();

    }
}
