package hackerrank.datastructure;

import java.util.Scanner;

/**
 * Created by heena.madan on 31/08/17.
 */
public class Java2DArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int result = Integer.MIN_VALUE;
        for (int i = 1; i <= 6 - 2; i++) {
            for (int j = 1; j <= 6 - 2; j++) {
                result = Math.max(result, arr[i - 1][j - 1] + arr[i - 1][j] + arr[i - 1][j + 1] + arr[i][j] + arr[i + 1][j - 1]
                        + arr[i + 1][j] + arr[i + 1][j + 1]);
            }
        }
        System.out.println(result);
    }
}


//1 1 1 0 0 0
//        0 1 0 0 0 0
//        1 1 1 0 0 0
//        0 0 2 4 4 0
//        0 0 0 2 0 0
//        0 0 1 2 4 0
//        Sample Output
//
//        19
//        Explanation
//
//        The hourglass which has the largest sum is:
//
//        2 4 4
//        2
//        1 2 4