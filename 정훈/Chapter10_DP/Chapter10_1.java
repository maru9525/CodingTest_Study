package CodingTest_Study.정훈.Chapter10_DP;

import java.util.Scanner;

public class Chapter10_1 {
    static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            solve(i);
        }
        System.out.println(dp[n]);
    }
    private static int solve(int n) {
        return dp[n] = dp[n-1] + dp[n-2];
    }

}
