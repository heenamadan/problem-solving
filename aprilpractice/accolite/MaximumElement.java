package aprilpractice.accolite;

import java.util.Scanner;

public class MaximumElement {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            int N = in.nextInt();
            int[] arr1 = new int[N];
            for (int i = 0; i < N; i++) {
                arr1[i] = in.nextInt();

            }

            System.out.println(findMax(arr1,0,N-1));
            testCases--;
        }
    }

    static int findMax(int array[], int low, int high)
    {
        if(low == high)//only one element
        {
            return array[low];
        }
        if((high- 1 == low))//if two elements present, return maximum element
        {
            if(array[low] >= array[high])
            {
                return array[low];
            }
            else
            {
                return array[high];
            }
        }
        int mid = (low + high)/2;
        //If mid is greater than previous and next, mid is maximum so, return maximum
        if(array[mid]>array[mid+1] && array[mid]>array[mid-1])
        {
            return array[mid];
        }
        //If mid is greater than its next element and smaller than its previous element
        //then maximum will be in left part of the mid
        if(array[mid]>array[mid+1] && array[mid]<array[mid-1])
        {
            return findMax(array,low,mid-1);
        }
        //If mid is less than its next and greater than previous element
        //then maximum will be in right part of mid
        else
        {
            return findMax(array,mid+1,high);
        }
    }
}

/*

Execution Time:0.19
2
11
1 2 3 4 5 6 5 4 3 2 1
9
1 3 4 5 7 8 9 5 2

6
9

 */