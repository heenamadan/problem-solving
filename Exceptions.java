/**
 * Created by heena.madan on 27/07/17.
 */
public class Exceptions {

    public static void main(String args[]) {

        test();
    }



    public static int test(){

        try{

            System.out.println("try");
           // int x=1/0;
            return 1;

        }catch(Exception e){
            System.out.println("catch");
        }finally {
            System.out.println("finally");
            return 2;
        }
    }
}

