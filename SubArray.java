/**
 * Created by heena.madan on 23/07/17.
 */
public class SubArray {

    static int arr[] = new int[]{1, 2,1};

    // Prints all subarrays in arr[0..n-1]
    static void subArray( int n)
    {
        // Pick starting point
        for (int i=0; i <n; i++)
        {
            // Pick ending point
            for (int j=i; j<n; j++)
            {
                // Print subarray between current starting
                // and ending points
                for (int k=i; k<=j; k++) {
                    System.out.print(arr[k] + ",");
                   // System.out.print( ",");
                }
                System.out.println();
            }
        }
    }

    // Driver method to test the above function
    public static void main(String[] args)
    {
        System.out.println("All Non-empty Subarrays");
        subArray(arr.length);

    }
}

