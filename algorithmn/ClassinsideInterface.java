package algorithmn;


interface I{

    class GfG
    {
        void m1(){
            System.out.println("inside m1");
        }
        void m2(){
            System.out.println("inside m2");
        }
    }
}
public class ClassinsideInterface {
    public static void main(String args[]){
    I.GfG ia = new I.GfG();
ia.m1();
ia.m2();
}
}
