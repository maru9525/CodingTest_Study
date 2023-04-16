package CodingTest_Study.정훈.Chapter8_DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Chapter8_14 {
    static class Pair{
        int x;
        int y;
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }
    static int n,m;
    static int answer = Integer.MAX_VALUE;
    static ArrayList<Pair> pz, hs;
    static int[] combi;
    static int len;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        pz = new ArrayList<>();
        hs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int tmp = Integer.parseInt(st.nextToken());
                if(tmp == 1) hs.add(new Pair(i,j));
                else if(tmp ==2) pz.add(new Pair(i,j));
            }
        }
        len = pz.size();
        combi = new int[m];
        dfs(0,0);
        System.out.println(answer);
    }

    private static void dfs(int L, int s) {
        if(L == m) {
            int sum = 0;
            for(Pair p : hs) {
                int dis = Integer.MAX_VALUE;
                for(int i : combi) {
                    dis = Math.min(dis, Math.abs(p.x - pz.get(i). x) + Math.abs(p.y - pz.get(i).y));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        }else {
            for (int i = s; i < len; i++) {
                combi[L] = i;
                dfs(L+1, i+1);
            }
        }
    }
}
