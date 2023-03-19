package CodingTest_Study.정훈.Chapter8_DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Chapter8_5 {
    static int n;
    static Integer[] coin;
    static int m;
    static int answer = Integer.MAX_VALUE;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        coin = new Integer[n];
        for (int i = 0; i < n; i++) {
            coin[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(coin, Collections.reverseOrder());
        m = Integer.parseInt(br.readLine());

        dfs(coin, 0, 0);
        System.out.println(answer);
    }

    private static void dfs(Integer[] coin, int cnt, int sum) {
        if(sum>m) return;
        if(cnt>answer) return;
        if(sum==m) {
            answer = Math.min(answer, cnt);
        }else {
            for (int i = 0; i < n; i++) {
                dfs(coin, cnt+1, sum+coin[i]);
            }
        }
    }
}
