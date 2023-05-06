package CodingTest_Study.정훈.Chapter9_Greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Chapter9_3 {
    static class Pair implements Comparable<Pair>{
        int time;
        char state;
        public Pair(int time, char state) {
            this.time = time;
            this.state = state;
        }

        @Override
        public int compareTo(Pair o) {
            if(this.time ==o.time) return this.state-o.state;
            return this.time - o.time;
        }
    }
    static int n;
    static int answer;
    static int cnt;
    static int max = Integer.MIN_VALUE;
    static ArrayList<Pair> list = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new Pair(x, 's'));
            list.add(new Pair(y, 'e'));
        }
        System.out.println(solve(list));
    }
    private static int solve(ArrayList<Pair> list) {
        int answer = Integer.MIN_VALUE;
        Collections.sort(list);
        int cnt = 0;
        for(Pair p : list) {
            if(p.state == 's') cnt++;
            else cnt--;
            answer = Math.max(answer, cnt);
        }
        return answer;
    }
}
