package hackerrank;

import java.util.Scanner;

/**
 * Created by heena.madan on 30/07/17.
 */
public class Patterns {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if (s.trim().isEmpty()) {
            System.out.println(0);
        } else {
            String[] splitString = (s.replaceAll("^\\W+", "").split("[\\s!,?._'@]+"));
            System.out.println(splitString.length);
            for (String token : splitString) {
                System.out.println(token);
            }
        }
        scan.close();
    }
}
