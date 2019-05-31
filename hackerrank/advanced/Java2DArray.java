package hackerrank.advanced;

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
    }
}

