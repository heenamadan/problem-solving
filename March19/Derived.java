package March19;
class Base{
    void msg(){
       System.out.println("base");
   }

    //Base(){}

}
public class Derived extends Base{

     void msg(){
        System.out.println("base1");
    }

    public static void main(String args[]) {
        Base b=new Derived();
        b.msg();
    }

}
