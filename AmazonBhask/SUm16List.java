/*
package AmazonBhask;

import java.util.ArrayList;
import java.util.HashMap;

public class SUm16List {

    public static ArrayList<Integer> getPairs(int[] numbers, int solution) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(numbers == null || numbers.length == 0) {
            return result;
        }

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for(int number : numbers) {
            if(!hashMap.containsKey(solution - number)) {
                hashMap.put(number, solution - number);
            } else {
                result.add(new NumberPairs(number, solution - number));
            }
        }

        return result;
    }
}
*/
