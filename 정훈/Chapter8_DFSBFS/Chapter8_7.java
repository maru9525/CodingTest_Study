package CodingTest_Study.정훈.Chapter8_DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chapter8_7 {
    static int n,r;
    static int[][] dy = new int[35][35];
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        int answer = dfs(n,r);
        System.out.println(answer);
    }

    private static int dfs(int n, int r) {
        if(dy[n][r] >0 ) return dy[n][r];
        if(n==r || r == 0) return 1;
        else return dy[n][r] = dfs(n-1, r-1) + dfs(n-1,r);
    }
}
