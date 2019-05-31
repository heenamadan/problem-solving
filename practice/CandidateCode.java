package practice;

/**
 * Created by heena.madan on 04/09/17.
 */
/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        if (n < 3) {
            System.exit(0);
        } else {
            int[] intArray =new int[n];

            String str=in.nextLine();
            int arrIndex=0;
            StringTokenizer st = new StringTokenizer(str);
            while(st.hasMoreTokens()) {
                intArray[arrIndex] = Integer.parseInt(st.nextToken());
                arrIndex++;
            }
            System.out.println(findMaxSum(intArray));
        }
    }
    public static int findMaxSum(int[] a)
    {
        int [] array = {-2, -3, 4, -1, -2, 1, 5, -3};
        int currentSum = 0;
        int currentMax = 0;

        for (int i=0; i < array.length; i++)
        {
            currentSum += array[i];
            if(currentSum > currentMax)
                currentMax = currentSum;
            else if (currentSum < 0)
                currentSum = 0;
        }
        return currentMax;

    }
}

