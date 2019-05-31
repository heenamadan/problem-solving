/**
 * Created by heena.madan on 25/07/17.
 */
public class Question2 {
    public static void main(String[] args)
    {
        myMtd(null);

    }





    public static void myMtd(ArithmeticException e){

        System.out.println("ArithmeticException");
    }

    public static void myMtd(Exception e){

        System.out.println("Exception");
    }

    /*public static void myMtd(String s){

        System.out.println("String");
    }*/

    public static void myMtd(Object s){

        System.out.println("Object");
    }


}
