package hackerrank;

import java.util.Scanner;

/**
 * Created by heena.madan on 30/07/17.
 */
public class JavaIfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "";
        if (n % 2 == 1) {
            ans = "Weird";
        } else {

            if (n > 1 && n < 6) {
                ans = "Not Weird";
            }
            if (n > 5 && n < 21) {
                ans = "Weird";
            }
            if (n > 20) {
                ans = "Not Weird";
            }

        }


        System.out.println(ans);

    }
}
