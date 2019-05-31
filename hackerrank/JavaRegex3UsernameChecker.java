package hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by heena.madan on 31/07/17.
 */
public class JavaRegex3UsernameChecker {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String username = in.nextLine();
            String pattern = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(username);

        if (m.find( )) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
        testCases--;
    }
}
}

/*
Sample Input

4
alpha_naheed
xahidbuffon
nagib@007
123Swakkhar
Sample Output

Valid
Valid
Invalid
Invalid

 */