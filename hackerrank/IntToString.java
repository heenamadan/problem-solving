package hackerrank;

import java.util.Scanner;

/**
 * Created by heena.madan on 31/07/17.
 */
public class IntToString {
    public static void main(String[] args) {

        DoNotTerminate.forbidExit();

        try {
            Scanner in = new Scanner(System.in);
            int n = in .nextInt();
            in.close();
            String s = String.valueOf(n);


   if (n == Integer.parseInt(s)) {
        System.out.println("Good job");
    } else {
        System.out.println("Wrong answer.");
    }
} catch (DoNotTerminate.ExitTrappedException e) {
        System.out.println("Unsuccessful Termination!!");
        }
        }
        }
//100