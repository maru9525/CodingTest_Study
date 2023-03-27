package CodingTest_Study.정훈.Chapter8_DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chapter8_1 {
    static int n;
    static int[] arr;
    static boolean check;
    static int total = 0;
    static String answer = "NO";
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            total += arr[i];
        }
        check = false;
        dfs(arr, 0, 0);
        System.out.println(answer);
    }

    private static void dfs(int[] arr, int l, int sum ) {
        if(check) return;
        if(sum>total/2) return;
        if(l==n) {
            if((total-sum) == sum) {
                answer = "YES";
                check = true;
            }
        }else {
            dfs(arr,l+1, sum+arr[l]);
            dfs(arr,l+1, sum);
        }
    }
}
