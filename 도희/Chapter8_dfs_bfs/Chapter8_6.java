package CodingTest_Study.도희.Chapter8_dfs_bfs;

import java.util.Scanner;

public class Chapter8_6 {
    static int[][] memo;
    public static int re (int n, int r){
        if(memo[n][r]>0) return memo[n][r];
        if(n==r||r==0) return 1;
        else{
            return memo[n][r] = re(n-1,r-1)+re(n-1,r);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int r = scan.nextInt();
        memo = new int[35][35];
        int x = re(n,r);
        System.out.println(x);
    }
}
