package CodingTest_Study.정훈.Brute_Force;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BF_BJ_15661_링크와스타트 {
    static int n;
    static int[][] arr;
    static boolean[] visited;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        combi(0,0);
        System.out.println(min);
    }

    private static void combi(int depth, int start) {
        if(depth == n) {
            diff();
            return;
        }
        visited[depth] = true;
        combi(depth+1, start);
        visited[depth] = false;
        combi(depth + 1, start);

    }

    private static void diff() {
        int start = 0;
        int link = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(visited[i] != visited[j]) continue;
                if(visited[i]) {
                    start += arr[i][j] + arr[j][i];
                }else {
                    link += arr[i][j] + arr[j][i];
                }
            }
        }
        int temp = Math.abs(start-link);
        if(temp < min ) {
            min = temp;
        }


    }
}
