package CodingTest_Study.정훈.Brute_Force;

import java.util.Scanner;

public class BF_BJ_14501_퇴사 {
    static int n;
    static int[][] arr;
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            int time = sc.nextInt();
            int money = sc.nextInt();
            arr[i][0] = time;
            arr[i][1] = money;
        }
        dfs(0,0);

        System.out.println(max);
    }

    private static void dfs(int idx, int money) {
        if(idx >= n) {
            max = Math.max(max, money);
            return;
        }
        if(idx + arr[idx][0] <= n) {
            dfs(idx + arr[idx][0], money + arr[idx][1]);
        }else {
            dfs(idx + arr[idx][0], money);
        }

        dfs(idx + 1 , money);
    }
}
