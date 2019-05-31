package april19;

import java.util.Optional;

public class OptionalTest {
    public static void main(String args[]) {

        Integer value1 = null;
        Integer value2 = new Integer(10);

        //Optional.ofNullable - allows passed parameter to be null.
        Optional<Integer> a = Optional.ofNullable(value1);
       // System.out.println(a);

       // Optional<Integer> a1 = Optional.of(value1);
        //System.out.println(a1);

        //double c = 0.0;
        int c= 5/0;
        try{

        }
        catch(ArithmeticException e){
           // System.out.println("ar");

        }catch(Exception e){
            //System.out.println("ex");

        }
    }

    static double get(int x,int y) {
        return x/y;
    }
    }
