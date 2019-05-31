package hackerrank.biginteger;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by heena.madan on 13/08/17.
 */
public class JavaBigInteger {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BigInteger number1  = scanner.nextBigInteger();
        BigInteger number2  = scanner.nextBigInteger();
        System.out.println(number1.add(number2));
        System.out.println(number1.multiply(number2));

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
