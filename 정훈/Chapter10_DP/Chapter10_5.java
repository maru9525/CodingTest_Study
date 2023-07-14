package CodingTest_Study.정훈.Chapter10_DP;

import java.util.Scanner;

public class Chapter10_5 {
    static int n, m;
    static int[] dp;
    static int[] coins;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        m = sc.nextInt();
        dp = new int[m+1];
        dp[0] = 0;

        solve(m);

        System.out.println(dp[m]);
    }

    private static void solve(int m) {
        for (int i = 1; i <= m; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < n; i++) {
            for (int j = coins[i]; j <= m; j++) {
                dp[j] = Math.min(dp[j], dp[j- coins[i]] + 1);
            }
        }
    }
}
