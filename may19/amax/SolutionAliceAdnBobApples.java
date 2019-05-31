package may19.amax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionAliceAdnBobApples {

    public int solution(int[] A, int K, int L) {
        // write your code in Java SE 8
        if(K+L > A.length) {
            return -1 ;
        }
        int totalOfKAndL = 0;
        Integer[] a = Arrays.stream( A ).boxed().toArray( Integer[]::new );

        Integer[] maxAndStartingIndex = getMaxContiguosFromArray(a, K);
        totalOfKAndL+=maxAndStartingIndex[0];

        Integer[] leadingElements = Arrays.copyOfRange(a, 0, maxAndStartingIndex[1]);
        Integer[] trailingElements = Arrays.copyOfRange(a, (maxAndStartingIndex[1]+K), a.length);

        List<Integer> mergedLeadingAndTrailingElements = new ArrayList(Arrays.asList(leadingElements));
        mergedLeadingAndTrailingElements.addAll(Arrays.asList(trailingElements));
        Integer[] mergedLeadingAndTrailingElementsArray =  mergedLeadingAndTrailingElements.toArray(new Integer[0]);

        maxAndStartingIndex = getMaxContiguosFromArray(mergedLeadingAndTrailingElementsArray, L);

        totalOfKAndL+=maxAndStartingIndex[0];

        return totalOfKAndL;
    }

    static Integer[] getMaxContiguosFromArray(Integer[] a, int numberOrElements){
        int sumForFirst = 0;
        int sumForFirstPrev = 0;
        int startingIndexForK = 0;
        Integer[] maxAndStartingIndex = new Integer[2];
        for(int i = 0; i < a.length; i++){
            if(i <= a.length - numberOrElements) {
                for (int j = i; j < i + numberOrElements; j++) {
                    sumForFirst += a[j];
                }
            }

            if(sumForFirst >  sumForFirstPrev) {
                sumForFirstPrev = sumForFirst;
                startingIndexForK = i;

            }
            sumForFirst = 0;
        }
        maxAndStartingIndex[0] = sumForFirstPrev;
        maxAndStartingIndex[1] = startingIndexForK;
        return maxAndStartingIndex;
    }

}

   /* Example test:    ([6, 1, 4, 6, 3, 2, 7, 4], 3, 2)
        OK

        Example test:    ([10, 19, 15], 2, 2)
        OK */
