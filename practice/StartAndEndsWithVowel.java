package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StartAndEndsWithVowel {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        char[] charArray = word.toCharArray();
        scanner.close();
        Set<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        if(set.contains(charArray[0]) && set.contains(charArray[charArray.length-1])){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
