package sept;

import java.util.Arrays;

public class Max5 {
    static void print2largest(int arr[], int arr_size)
    {
        int i, first, second, third, fifth, fourth;

        /* There should be atleast two elements */
        if (arr_size < 3)
        {
            System.out.print(" Invalid Input ");
            return;
        }

        third = first = second = fourth=fifth= Integer.MIN_VALUE  ;
        for (i = 0; i < arr_size ; i ++)
        {
            /* If current element is smaller than
            first*/
            if (arr[i] > first)
            {   fifth=fourth;
                 fourth=third;
                third = second;
                second = first;
                first = arr[i];
            }

            /* If arr[i] is in between first and
            second then update second  */
            else if (arr[i] > second)
            {
                fifth=fourth;
                fourth=third;

                third = second;
                second = arr[i];
            }

            else if (arr[i] > third) {
                fifth=fourth;
                fourth=third;
                third = arr[i];
            }
            else if (arr[i] > fourth) {
                fifth=fourth;
                fourth = arr[i];
            }

            else if (arr[i] > fifth)
                fifth = arr[i];
        }

        System.out.println("five largest elements are " +
                first + " " + second + " " + third+" " + fourth+" " + fifth);
    }

    /* Driver program to test above function*/
    public static void main (String[] args)
    {
        int arr[] = {12, 13, 1, 10, 34, 1};
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0;i<5;i++){
           // System.out.println(arr[i]);
        }

        for(int i=arr.length-1;i>arr.length-1-5;i--){
            System.out.println(arr[i]);
        }
        //print2largest(arr, n);
    }
}
