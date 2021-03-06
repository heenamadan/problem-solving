package hackerrank.algo;

import java.util.Arrays;
import java.util.Scanner;

public class MInMax {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner in = new Scanner(System.in);
        long[] a = new long[5];
        long sum = 0;

        for (int i = 0 ; i < a.length ; i++){
            long temp = in.nextLong();
            a[i] = temp;
            sum += temp;
        }

        Arrays.sort(a);
        System.out.println((sum - a[a.length-1]) + " " + (sum - a[0]));

    }
}
