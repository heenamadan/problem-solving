package amazon;

import java.util.Scanner;

public class Solution {

    public static int[][] LCS(String A){
        int[][] dp = new int[A.length()+1][A.length()+1];
        for(int i = 1; i <= A.length(); i++){
            dp[1][i] = 1;
        }

        dp[1][A.length()] = 0;
        for(int i = 2; i < A.length();i++){
            for(int j = 0; j < A.length() - i + 1; j++){
                if(A.charAt(j) == A.charAt(j + i - 1))
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
        int[][] dp = LCS(str);
        for(int i = 1; i < str.length() - 1;i++){
            max = Math.max(dp[i][1] * dp[str.length() - i][i+1], max);
        }
        System.out.println(max);
    }
}
