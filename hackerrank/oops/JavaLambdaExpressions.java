package hackerrank.oops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * Created by heena.madan on 30/08/17.
 */
interface PerformOperation {
    boolean check(int a);
}
class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }
    public static PerformOperation isOdd() {
        return num -> num%2!=0;
    }
    public static PerformOperation isPrime() {
        return num -> new BigInteger(String.valueOf(num)).isProbablePrime(100);
    }



    public static PerformOperation isPalindrome(){
        return num -> String.valueOf(num).equals((new StringBuffer(String.valueOf(num))).reverse().toString());
    }
}
public class JavaLambdaExpressions {
    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T--> 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}

//5
//        1 4
//        2 5
//        3 898
//        1 3
//        2 12
//        Sample Output
//
//        EVEN
//        PRIME
//        PALINDROME
//        ODD
//        COMPOSITE