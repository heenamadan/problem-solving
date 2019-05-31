package aprilpractice.accolite;

import java.util.Arrays;
import java.util.Scanner;

public class TimeReduced {
    public static void main(String[] args) {
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
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            Outer:for(int i=0 ; i<arr1.length ; i++){
                for(int j=0 ; j<arr2.length ; j++){
                    if((arr1[i] <= arr2[j]) && (arr1[i] != arr2[j]) )
                        System.out.print(arr1[i] + " ");
                    else
                        break Outer;
                }
                System.out.println("");
            }
            System.out.println();
            testCases--;
        }

    }
}
