package hackerrank;

import java.util.Scanner;

/**
 * Created by heena.madan on 31/07/17.
 */
public class StringReverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean flag = isPalindrome(A);
        if (flag){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        final StringBuffer sb = new StringBuffer(input);
        return input.equals(sb.reverse().toString());
    }

}
