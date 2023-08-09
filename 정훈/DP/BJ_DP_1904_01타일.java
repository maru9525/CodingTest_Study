package CodingTest_Study.정훈.DP;

import java.util.Scanner;

public class BJ_DP_1904_01타일 {
    static int n;
    static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dp = new int[n+1];

        if(n == 1) {
            System.out.println(1);
            System.exit(0);
        }

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 15746;
        }

        System.out.println(dp[n]);
    }
}
