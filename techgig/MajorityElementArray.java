package techgig;

import java.util.Arrays;
import java.util.Scanner;

public class MajorityElementArray {

    public static void main(String args[]) {


    Scanner in = new Scanner(System.in);

    int no = in.nextInt();
        int[] array = new int[no];
        for(int i=0;i<no;i++) {
            array[i] = in.nextInt();
        }
        printMajority(array, no);


}

     static int majorityElements(int[] nums) {
        int result = 0, count = 0;

        for(int i = 0; i<nums.length; i++ ) {
            if(count == 0){
                result = nums[ i ];
                count = 1;
            }else if(result == nums[i]){
                count++;
            }else{
                count--;
            }
        }

        return result;
    }

    static public int majorityElement(int[] num) {
        if (num.length == 1) {
            return num[0];
        }

        Arrays.sort(num);
        return num[num.length / 2];
    }

    static void printMajority(int a[], int size)
    {
        /* Find the candidate for Majority*/
        int cand = findCandidate(a, size);

        /* Print the candidate if it is Majority*/
        if (isMajority(a, size, cand))
            System.out.println(" " + cand + " ");
        else
            System.out.println("No Majority Element");
    }

    /* Function to find the candidate for Majority */
    static int findCandidate(int a[], int size)
    {
        int maj_index = 0, count = 1;
        int i;
        for (i = 1; i < size; i++)
        {
            if (a[maj_index] == a[i])
                count++;
            else
                count--;
            if (count == 0)
            {
                maj_index = i;
                count = 1;
            }
        }
        return a[maj_index];
    }

    /* Function to check if the candidate occurs more
       than n/2 times */
    static boolean isMajority(int a[], int size, int cand)
    {
        int i, count = 0;
        for (i = 0; i < size; i++)
        {
            if (a[i] == cand)
                count++;
        }
        if (count > size / 2)
            return true;
        else
            return false;
    }
}
