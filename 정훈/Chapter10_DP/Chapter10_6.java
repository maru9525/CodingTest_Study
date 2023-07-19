package CodingTest_Study.정훈.Chapter10_DP;

import java.util.Scanner;

public class Chapter10_6 {
    static int n,m;
    static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();   //문제 수
        m = sc.nextInt();   //제한시간
        dp = new int[m+1];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int time = sc.nextInt();
            for (int j = m; j >= time ; j--) {
                dp[j] = Math.max(dp[j], dp[j-time]+num);
            }
        }
        System.out.println(dp[m]);
    }
}
