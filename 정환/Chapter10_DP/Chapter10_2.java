package CodingTest_Study.정환.Chapter10_DP;

import java.util.Scanner;

public class Chapter10_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+2];

        System.out.println(jump(n, dp));

    }
    static int jump(int n, int[] dp){
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3; i<=n+1; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n+1];

    }
}
