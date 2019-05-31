package March19;

import java.util.HashSet;
import java.util.Set;

public class OrderOfCharactersForPattern
{
    public static boolean followsPattern(String str, String pattern)
    {
        // Insert all characters of pattern in a hash set,
        Set<Character> patternSet = new HashSet<>();
        for (int i=0; i<pattern.length(); i++)
            patternSet.add(pattern.charAt(i));

        // Build modified string (string with characters only from
        // pattern are taken)
        StringBuilder modifiedString = new StringBuilder(str);
        for (int i=str.length()-1; i>=0; i--)
            if (!patternSet.contains(modifiedString.charAt(i)))
                modifiedString.deleteCharAt(i);

        // Remove more than one consecutive occurrences of pattern
        // characters from modified string.
        for (int i=modifiedString.length()-1; i>0; i--)
            if (modifiedString.charAt(i) == modifiedString.charAt(i-1))
                modifiedString.deleteCharAt(i);

        // After above modifications, the length of modified string
        // must be same as pattern length
        if (pattern.length() != modifiedString.length())
            return false;

        // And pattern characters must also be same as modified string
        // characters
        for (int i=0; i<pattern.length(); i++)
            if (pattern.charAt(i) != modifiedString.charAt(i))
                return false;

        return true;
    }

    // Driver program
    public static void main(String[] args)
    {
        /*String str = "engineers rock";
        String pattern = "er";
        System.out.println("Expected: true, Actual: " +
                followsPattern(str, pattern));

        str = "engineers rock";
        pattern = "egr";
        System.out.println("Expected: false, Actual: " +
                followsPattern(str, pattern));

        str = "engineers rock";
        pattern = "gsr";
        System.out.println("Expected: false, Actual: " +
                followsPattern(str, pattern));*/

        String str = "abcNjhgAhGjhfhAljhRkhgRbhjbevfhO";
        String pattern = "NAGARRO";
        System.out.println("Expected: true, Actual: " +
                containsSubsequence(str, pattern));

    }

    public static boolean containsSubsequence(
            final String sequence, final String subsequence) {
        if (subsequence.isEmpty()) {
            return true;
        }
        int subsequenceIndex = 0;
        for (int i = 0; i < sequence.length(); ++i) {
            if (sequence.charAt(i) == subsequence.charAt(subsequenceIndex)) {
                ++subsequenceIndex;
                if (subsequenceIndex == subsequence.length()) {
                    return true;
                }
            }
        }
        return false;
    }
}
