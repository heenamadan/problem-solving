package chegg;

import java.time.Duration;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class Dragon {

    public static void main(String [] args) {
        //int arr[] =  {1, 2, 2, 1, 5, 1, 1, 7, 7, 7 ,7 ,1 ,1};
        int arr[] =  {1, 9, 3, 10, 4, 20, 2};
        Duration duration = Duration.ofMillis(5000);
        TreeMap<String,String> treeMap = new TreeMap<>();
        System.out.println(duration.toString());

        System.out.println(findLongestConseqSubseq(arr,arr.length));
    }

    public static int array(final int[] array) {
        int lastNo = -100;
        int maxConsecutiveNumbers = 0;
        int currentConsecutiveNumbers = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == lastNo + 1) {
                currentConsecutiveNumbers++;
                maxConsecutiveNumbers = Math.max(maxConsecutiveNumbers,
                        currentConsecutiveNumbers);
            } else {
                currentConsecutiveNumbers = 1;
            }
            lastNo = array[i];
        }
        return Math.max(maxConsecutiveNumbers, currentConsecutiveNumbers);
    }

    public static int longestConsecutive(int[] num) {
        // if array is empty, return 0
        if (num.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<Integer>();
        int max = 1;

        for (int e : num)
            set.add(e);

        for (int e : num) {
            int left = e - 1;
            int right = e + 1;
            int count = 1;

            while (set.contains(left)) {
                count++;
                set.remove(left);
                left--;
            }

            while (set.contains(right)) {
                count++;
                set.remove(right);
                right++;
            }

            max = Math.max(count, max);
        }

        return max;
    }
    static int findLongestConseqSubseq(int arr[],int n)
    {
        HashSet<Integer> S = new HashSet<Integer>();
        int ans = 0;

        // Hash all the array elements
        for (int i=0; i<n; ++i)
            S.add(arr[i]);

        // check each possible sequence from the start
        // then update optimal length
        for (int i=0; i<n; ++i)
        {
            // if current element is the starting
            // element of a sequence
            if (!S.contains(arr[i]-1))
            {
                // Then check for next elements in the
                // sequence
                int j = arr[i];
                while (S.contains(j))
                    j++;

                // update  optimal length if this length
                // is more
                if (ans<j-arr[i])
                    ans = j-arr[i];
            }
        }
        return ans;
    }
    }
