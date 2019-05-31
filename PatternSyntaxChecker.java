import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Created by heena.madan on 30/07/17.
 */
public class PatternSyntaxChecker {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        int i=0;
        while(i<testCases){
            String pattern = in.nextLine();
            try{
                Pattern.compile(pattern);
                System.out.println("valid");

            }catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }
            i++;
        }
    }
}
