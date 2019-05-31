package hackerrank.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by heena.madan on 13/08/17.
 */
public class TryCatchException {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
        try {
        int y = in.nextInt();
        int z = in.nextInt();
        int r = y/z;
        System.out.print(r);
    }
        catch (InputMismatchException ime) {
        System.out.print(ime.getClass().getName());
    }
        catch (ArithmeticException e) {
            System.out.println(e.getClass().getName() + ": / by zero");
        }
}
}
