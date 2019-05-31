package aprilpractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistinctPairs {

    static int arr[] = new int[]{1,2,3,4,5,5,5,5,6,7,8,9,1,9} ;

    //Arrays.asList(arr);

    // Returns number of pairs in arr[0..n-1] with sum equal
    // to 'sum'
    static int getPairsCount(int n, int sum)
    {

         int arr1[] = new int[]{1,2,3,4,5,5,5,5,6,7,8,9,1,9} ;


        List list = Arrays.asList(arr1);
        Set set= new HashSet(list);
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Store counts of all elements in map hm
        for (int i=0; i<n; i++){

            // initializing value to 0, if key not found
            if(!hm.containsKey(arr[i]))
                hm.put(arr[i],0);

            hm.put(arr[i], hm.get(arr[i])+1);
        }
        int twice_count = 0;

        // iterate through each element and increment the
        // count (Notice that every pair is counted twice)
        for (int i=0; i<n; i++)
        {
            if(hm.get(sum-arr[i]) != null)
                twice_count += hm.get(sum-arr[i]);

            // if (arr[i], arr[i]) pair satisfies the condition,
            // then we need to ensure that the count is
            // decreased by one such that the (arr[i], arr[i])
            // pair is not considered
            if (sum-arr[i] == arr[i])
                twice_count--;
        }

        // return the half of twice_count
        return twice_count/2;
    }

    // Driver method to test the above function
    public static void main(String[] args) {

        int sum = 10;
        /*System.out.println("Count of pairs is " +
                getPairsCount(arr.length,sum));*/
       getPairsCount(arr,10);

    }

    public static void getPairsCount(int[] arr, int sum)
    {

        int count = 0;// Initialize result

        // Consider all possible pairs and check their sums
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == sum)
                    count++;

        System.out.printf("Count of pairs is %d",count);

    }
}
