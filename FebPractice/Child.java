package FebPractice;

public class Child extends Base {

    public String sum(){
        System.out.println("child");
        return "hena";
    }


    public static void hello(){
        System.out.println("childhmm");
    }

    /*public Object sum(){
        System.out.println("hello");
        return null;
    }*/
    public static void main(String a[]){
       // Base b1=new Base();

        String str="true";
        Base b= new Child();
        System.out.println(b.sum());



    }
}
