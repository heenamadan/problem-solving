package aprilpractice.accolite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FirstButNotInSecond {

    public static void main(String[] args) {
        Integer [] first = { 1,2,3,4,5 };
        Integer [] second = { 2,3,1,0,5 };

        System.out.println(getMissingNumbers(first, second));

        first = new Integer [] { 1,2,3,4,5 };
        second = new Integer [] { 11, 1, 5 };

        System.out.println(getMissingNumbers(first, second));
    }

    /**
     * This method gets the numbers which are present in first and not in second.
     *
     * @return
     */
    private static List<Integer> getMissingNumbers(Integer [] first, Integer [] second) {
        List<Integer> missing = new ArrayList<Integer>(new HashSet<Integer>(Arrays.asList(first)));
        for (Integer num : second) {
            missing.remove(num);
        }
        return missing;
    }
}
