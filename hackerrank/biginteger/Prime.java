package hackerrank.biginteger;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by heena.madan on 13/08/17.
 */
public class Prime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();
        if(n.isProbablePrime(1)){
            System.out.println("prime");
        }
        // Write your code here.
    }
}





//    public static boolean isPrime(int num){
//        if ( num > 2 && num%2 == 0 ) {
//            System.out.println(num + " is not prime");
//            return false;
//        }
//        int top = (int)Math.sqrt(num) + 1;
//        for(int i = 3; i < top; i+=2){
//            if(num % i == 0){
//                System.out.println(num + " is not prime");
//                return false;
//            }
//        }
//        System.out.println(num + " is prime");
//        return true;
//    }