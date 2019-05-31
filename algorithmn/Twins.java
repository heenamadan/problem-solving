package algorithmn;

import java.util.Arrays;

public class Twins {


    public static void main(String[] args) {
String[] arr = twins();
        System.out.println(arr.length);
    }


    static String[] twins() {
        String[] a = {"cdab", "dcba"};
        String[] b = {"abcd", "abcd"};
        String[] out= {};

        for( int i=0;i< a.length;i++) {
            if (a[i].length() == b[i].length()) {
                if (containsSameChars(a[i], b[i])) {
                    char[] charsOfA = a[i].toCharArray();
                    char[] charsOfB = b[i].toCharArray();
                    StringBuilder oddOfA = new StringBuilder();
                    StringBuilder evenOfA = new StringBuilder();
                    StringBuilder oddOfB = new StringBuilder();
                    StringBuilder evenOfB = new StringBuilder();
                    for (int j = 0; j < charsOfA.length; j++) {
                        if (j % 2 == 0) {
                            oddOfA.append(charsOfA[j]);
                            oddOfB.append(charsOfB[j]);
                        } else {
                            evenOfA.append(charsOfA[j]);
                            evenOfB.append(charsOfB[j]);
                        }
                    }
                    if (containsSameChars(oddOfA.toString(), oddOfB.toString())
                            && containsSameChars(evenOfA.toString(), evenOfB.toString())) {
                        out[i] = "Yes";
                    }
                }
                else{
                    out[i] = "No";

                }
            } else{
                out[i] = "No";

            }
        }
        return out;
    }

    static boolean containsSameChars(String s1, String s2) {
        char[] first = s1.toCharArray();
        char[] second = s2.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first, second);
    }
}