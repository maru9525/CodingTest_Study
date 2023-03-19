package CodingTest_Study.정훈.Chapter8_DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chapter8_2 {
    static int n;
    static int w;
    static int[] arr;
    static int answer;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        w = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        dfs(arr, 0, 0);

        System.out.println(answer);

    }

    private static void dfs(int[] arr, int cnt, int sum) {
        if(sum>w) return;
        if(cnt == n) {
            answer = Math.max(answer, sum);
        }else {
            dfs(arr, cnt+1, sum+arr[cnt]);
            dfs(arr, cnt+1, sum);
        }
    }
}
