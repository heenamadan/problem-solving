package hackerrank.datastructure;

import java.util.Scanner;

/**
 * Created by heena.madan on 31/08/17.
 */
public class JavaSubArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size     = scan.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();

        System.out.println(conigeousNegativeSubarrays(array));
    }

    private static int conigeousNegativeSubarrays(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                if (sum < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}

/*
5
        1 -2 4 -5 1*/
