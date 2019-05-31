package may19;

import java.util.Arrays;

public class GFG {



    static int findMinimumAdjacentSwaps(String str)
    {

        char[] ch =str.toCharArray();
        int N= ch.length;
        // visited array to check if value is seen already
        boolean[] visited = new boolean[N + 1];

        int minimumSwaps = 0;
        Arrays.fill(visited,false);


        for (int i = 0; i <  N; i++) {

            if (ch[i] == 'R') {



            // If the arr[i] is seen first time
            if (visited[ch[i]] == false) {
                visited[ch[i]] = true;

                // stores the number of swaps required to
                // find the correct position of current
                // element's partner
                int count = 0;

                for (int j = i + 1; j < N; j++) {

                    // Increment count only if the current
                    // element has not been visited yet (if is
                    // visited, means it has already been placed
                    // at its correct position)
                    if (visited[ch[j]] == false)
                        count++;

                        // If current element's partner is found
                    else if (ch[i] == ch[j])
                        minimumSwaps += count;
                }
            }
        }
        }
        return minimumSwaps;
    }

    static int minSwaps(int arr[], int n)
    {

        int numberOfOnes = 0;

        // find total number of all 1's
        // in the array
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1)
                numberOfOnes++;
        }

        // length of subarray to check for
        int x = numberOfOnes;

        int count_ones = 0, maxOnes;

        // Find 1's for first subarray
        // of length x
        for(int i = 0; i < x; i++){
            if(arr[i] == 1)
                count_ones++;
        }

        maxOnes = count_ones;

        // using sliding window technique
        // to find max number of ones in
        // subarray of length x
        for (int i = 1; i <= n-x; i++) {

            // first remove leading element
            // and check if it is equal to
            // 1 then decreament the
            // value of count_ones by 1
            if (arr[i - 1] == 1)
                count_ones--;

            // Now add trailing element
            // and check if it is equal
            // to 1 Then increament the
            // value of count_ones by 1
            if(arr[i + x - 1] == 1)
                count_ones++;

            if (maxOnes < count_ones)
                maxOnes = count_ones;
        }

        // calculate number of zeros in
        // subarray of length x with
        // maximum number of 1's
        int numberOfZeroes = x - maxOnes;

        return numberOfZeroes;
    }

    // Driver code
    public static void main(String args[])
    {
        int a[] = new int[]{0, 0, 1, 0,
                1, 1, 0, 0, 1};
        int n = a.length;

       // System.out.println(minSwaps(a, n));

        System.out.println(findMinimumAdjacentSwaps("WRRWWR"));
    }
}
