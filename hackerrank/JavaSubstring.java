package hackerrank;

import java.util.Scanner;

/**
 * Created by heena.madan on 31/07/17.
 */
public class JavaSubstring {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start,end));
    }
}
