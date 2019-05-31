package pitney;

import java.util.Scanner;

public class Solution {

    public static int[][] maxPalindromeSequence1(String word){
        final int[][] dp = new int[word.length()+1][word.length()+1];
        for(int i = 1; i <= word.length(); i++){
            dp[1][i] = 1;
        }

        dp[1][word.length()] = 0;
        for(int i = 2; i < word.length();i++){
            for(int j = 0; j < word.length() - i + 1; j++){
                if(word.charAt(j) == word.charAt(j + i - 1))
                    dp[i][j + 1] = 2 + dp[i - 2][j + 2];
                else dp[i][j+1] = Math.max(dp[i - 1][j+1], dp[i - 1][j + 2]);
            }
        }
        return dp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        long max = 0;
        System.out.println("--"+getScore(str));
        int[][] dp = maxPalindromeSequence(str);
        for(int i = 1; i < str.length() - 1;i++){
            max = Math.max(dp[i][1] * dp[str.length() - i][i+1], max);
        }
        System.out.println(max);
    }

    static int getScore(String s) {
        int[][] aray = maxPalindromeSequence(s);
        int max = 0;
        for(int i = 1; i < s.length() - 1;i++){
            max = Math.max(aray[i][1] * aray[s.length() - i][i+1], max);
        }
        return max;

    }

    public static int[][] maxPalindromeSequence(String word){
        final int[][] dp = new int[word.length()+1][word.length()+1];
        for(int i = 1; i <= word.length(); i++){
            dp[1][i] = 1;
        }

        dp[1][word.length()] = 0;
        int len =word.length();
        for(int i = 2; i < len;i++){
            for(int j = 0; j < len - i + 1; j++){
                if(word.charAt(j) == word.charAt(j + i - 1))
                    dp[i][j + 1] = 2 + dp[i - 2][j + 2];
                else dp[i][j+1] = Math.max(dp[i - 1][j+1], dp[i - 1][j + 2]);
            }
        }
        return dp;
    }
}
