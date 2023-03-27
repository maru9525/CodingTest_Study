package CodingTest_Study.정훈.Chapter8_DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chapter8_8 {
    static int n, f;
    static boolean[] check;
    static int[] a;
    static int[] b;
    static int[][] dy = new int[35][35];
    static boolean flag = false;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        f = Integer.parseInt(st.nextToken());
        check = new boolean[n+1];
        a = new int[n];
        b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = combi(n-1, i);
        }
        dfs(0,0);
    }

    private static void dfs(int cnt, int sum) {
        if(flag) return;
        if(cnt==n) {
            if(sum == f) {
                for (int x :
                        b) {
                    System.out.print(x + " ");
                }
                flag = true;
            }
        }else {
            for (int i = 1; i <= n; i++) {
                if(check[i] == false){
                    check[i] = true;
                    b[cnt] = i;
                    dfs(cnt+1, sum+(a[cnt] * b[cnt]));
                    check[i] = false;
                }
            }
        }

    }

    private static int combi(int n , int r) {
        if(dy[n][r] > 0) return dy[n][r];
        if(n==r || r==0) return 1;
        else return dy[n][r] = combi(n-1,r-1) + combi(n-1, r);
    }
}
