package CodingTest_Study.정훈.Chapter8_DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Chapter8_3 {
    static int n,m;
    static class Pair{
        int x;
        int y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static ArrayList<Pair> list = new ArrayList<>();
    static int answer;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.add(new Pair(a,b));
        }
        dfs(list, 0, 0, 0);

        System.out.println(answer);
    }

    private static void dfs(ArrayList<Pair> list, int cnt, int sum, int time) {
        if(time>m) return;
        if(cnt==n) {
            answer = Math.max(answer, sum);
        }else {
            dfs(list, cnt+1, sum+list.get(cnt).x, time+list.get(cnt).y);
            dfs(list, cnt+1, sum, time);

        }
    }
}
