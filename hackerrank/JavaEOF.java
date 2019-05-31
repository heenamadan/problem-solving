package hackerrank;

import java.util.Objects;
import java.util.Scanner;

/**
 * Created by heena.madan on 30/07/17.
 */
public class JavaEOF {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String scanLine = scanner.nextLine();
        int i=1;
        while(Objects.nonNull(scanLine)){
            System.out.println(i++ +" "+ scanLine);
            scanLine = scanner.nextLine();
        }
    }
}
