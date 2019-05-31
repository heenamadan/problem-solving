package maypractice;

import java.util.Arrays;
import java.util.Collections;

public class kLargestElements {

    public static void main(String[] args)
    {
        int arr[] = new int[]{1, 23, 12, 9,
                30, 2, 50};
        int k = 3;
        kLargest2(arr,k);
        kLargest(3);
    }

    public static void kLargest(int k)
    {
        Integer [] arr = new Integer[]{1, 23, 12, 9,
                30, 2, 50};
        // Sort the given array arr in reverse order
        // This method doesn't work with primitive data
        // types. So, instead of int, Integer type
        // array will be used
        Arrays.sort(arr, Collections.reverseOrder());


        // Print the first kth largest elements
        for (int i = 0; i < k; i++)
            System.out.print(arr[i] + " ");
    }

    public static void kLargest2(int[] array, int k){

        int minIndex = 0, i;                            //Find Min

        for (i = k; i < array.length; i++){
            minIndex = 0;
            for (int j = 0; j < k; j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                    array[minIndex] = array[j];
                }
            }
            if (array[minIndex] < array[i]){         //Swap item if min < array[i]

                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
        for (int q = 0; q < k; q++){                            //Print output
            System.out.print(array[q] + " ");
        }
    }
}
