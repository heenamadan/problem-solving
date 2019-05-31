package array;

import java.util.Arrays;
import java.util.BitSet;

/**
 * Created by heena.madan on 25/08/17.
 */
public class MissingNumberInArray {

    public static void main(String args[]) {
        // one missing number
        int[] iArray = new int[]{1, 5, 2};


        //int missing = getMissingNumber(iArray, 5);
        printMissingNumber(iArray,5);

        //System.out.println(missing);


    }


    private static int getMissingNumber(int[] numbers, int n) {
        int expected = n*((n+1)/2);
        int actual = 0;
        for(int num:numbers){
            actual +=num;

        }
        return expected - actual;


    }

    //more than one missing number
    private static void printMissingNumber(int[] numbers, int count) {
        int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(count);
        for (int number : numbers) {
            bitSet.set(number - 1);
        }
        System.out.printf("Missing numbers in integer array %s, with total number %d is %n",
                Arrays.toString(numbers), count);
        int lastMissingIndex = 0;
        for (int i = 0; i < missingCount; i++) {
            System.out.println("card-->"+bitSet.cardinality());
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }
    }



}
