package CodingTest_Study.정훈.Chapter10_DP;

import java.util.Scanner;

public class Chapter10_2 {
    static int n;
    static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dp = new int[n];
        dp[0] = 2;
        dp[1] = 3;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[n-1]);


    }
}
