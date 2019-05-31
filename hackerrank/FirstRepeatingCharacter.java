package hackerrank;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by heena.madan on 27/08/17.
 */
public class FirstRepeatingCharacter {

    public static void main (String[] args)
    {
        String str = "geeksforgeeks";
        char[] arr = str.toCharArray();
        System.out.println(firstRepeating(arr));
    }

    static char firstRepeating(char str[])
    {
        // Creates an empty hashset
        HashSet<Character> h = new HashSet<>();

        // Traverse the input array from left to right
        for (int i=0; i<=str.length-1; i++)
        {
            char c = str[i];

            // If element is already in hash set, update x
            // and then break
            if (h.contains(c))
                return c;

            else // Else add element to hash set
                h.add(c);
        }

        return '\0';
    }

    public static char getFirstNonRepeatedChar(String str) {
        Map<Character,Integer> counts = new LinkedHashMap<>(str.length());
        for (char c : str.toCharArray()) {
            counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
        }
        for (Map.Entry<Character,Integer> entry : counts.entrySet())
        {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        } throw new RuntimeException("didn't find any non repeated Character");
    }

}
