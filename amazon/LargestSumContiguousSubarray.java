package amazon;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
//https://www.programcreek.com/2013/01/leetcode-longest-consecutive-sequence-java/

/**
 * Created by heena.madan on 04/09/17.
 */
//-2 -3 4 -1 -2 1 5 -3
public class LargestSumContiguousSubarray {
    public static void main(String a[]) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
       String str= in.nextLine();
        if (n < 3) {
            System.exit(0);
        } else {
            int[] intArray =new int[n];
            int arrIndex=0;
            StringTokenizer st = new StringTokenizer(str);
            while(st.hasMoreTokens()) {
                intArray[arrIndex] = Integer.parseInt(st.nextToken());
                arrIndex++;
            }
            System.out.println(findMaxSum(intArray));
        }
    }



    public static int findMaxSum(int[] array)
    {
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
//int[] intArray = Arrays.stream(strArray).mapToInt(Integer::parseInt).toArray();
