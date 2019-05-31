package hackerrank;

import java.util.Scanner;

/**
 * Created by heena.madan on 31/07/17.
 */
public class SubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int len = s.length();

        for(int i=0;i<=len-k;i++){
            String substring = s.substring(i,i+k);
            if(i ==0){
                smallest = substring;
            }
            if(substring.compareTo(smallest)<0){
                smallest=substring;
            }
            if(substring.compareTo(largest)>0){
                largest=substring;
            }
        }

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
