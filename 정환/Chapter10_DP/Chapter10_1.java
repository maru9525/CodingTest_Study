package CodingTest_Study.정환.Chapter10_DP;

import java.util.Scanner;

public class Chapter10_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        System.out.println(stair(n, dp));
    }


    static int stair(int n, int dp[]){
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3; i<=n; i++){
            dp[i] = dp[i-2]+dp[i-1];
        }
        return dp[n];
    }

}
