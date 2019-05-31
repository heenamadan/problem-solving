package aprilpractice.accolite;

import java.util.Scanner;

public class InFirstButSecond {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            int N1 = in.nextInt();
            int N2 = in.nextInt();
            int[] arr1 = new int[N1];
            int[] arr2 = new int[N2];
            for (int i = 0; i < N1; i++) {
                arr1[i] = in.nextInt();

            }
            for (int i = 0; i < N2; i++) {
                arr2[i] = in.nextInt();

            }
            //findMissingNumber(arr1, arr2); //Execution Time:0.67
            findMissing(arr1,arr2,N1,N2);////Execution Time:0.76
            System.out.println();
            testCases--;
        }
    }
    private static void findMissingNumber(int[] a, int[] b) {
        for (int n : a) {
            if (!isPresent(n, b)) {
                System.out.print(n+ " ");
            }
        }
    }

    private static boolean isPresent(int n, int[] b) {
        for (int i : b) {
            if (n == i) {
                return true;
            }
        }
        return false;
    }

    static void findMissing(int a[], int b[],
                            int n, int m)
    {
        for (int i = 0; i < n; i++)
        {
            int j;
            for (j = 0; j < m; j++) {
                if (a[i] == b[j])
                    break;
            }

            if (j == m)
                System.out.print(a[i] + " ");
        }
    }
}
/*Execution Time:0.67
Input:
        2
        6 5
        1 2 3 4 5 10
        2 3 1 0 5
        5 5
        4 3 5 9 11
        4 9 3 11 10

        Output:
        4 10
        5
        */