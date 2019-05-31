/**
 * Created by heena.madan on 25/07/17.
 */
public class Question1 {
    public static void main(String[] args)
    {
        myMtd(null);

    }

    public static void myMtd(Object s){

        System.out.println("Object");
    }

    public static void myMtd(String s){

        System.out.println("String");
    }

    //IF INTEGER is passed as parameter then Ambuigity error comes.
    /*public static void myMtd(Integer inte){

        System.out.println("Integer");
    }*/
}
