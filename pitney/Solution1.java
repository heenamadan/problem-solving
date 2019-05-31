package pitney;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        int res;
        String s;
        try {
            s = in.nextLine();
        } catch (Exception e) {
            s = null;
        }

        res = getScore(s);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
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
        for(int i = 2; i < word.length();i++){
            for(int j = 0; j < word.length() - i + 1; j++){
                if(word.charAt(j) == word.charAt(j + i - 1))
                    dp[i][j + 1] = 2 + dp[i - 2][j + 2];
                else dp[i][j+1] = Math.max(dp[i - 1][j+1], dp[i - 1][j + 2]);
            }
        }
        return dp;
    }
}

