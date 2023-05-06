package CodingTest_Study.정훈.Chapter9_Greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Chapter9_4 {
    static class Lecture implements Comparable<Lecture>{
        int money;
        int time;
        Lecture(int money, int time) {
            this.money = money;
            this.time = time;
        }

        @Override
        public int compareTo(Lecture o) {
            return o.time- this.time;
        }
    }
    static int n,m,d;
    static int max = Integer.MAX_VALUE;
    static ArrayList<Lecture> list = new ArrayList<>();
    static int answer;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            d = Integer.parseInt(st.nextToken());
            list.add(new Lecture(m,d));
            if(d > max) max = d;
        }
        solve();
        System.out.println(answer);
    }

    private static void solve() {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(list);
        int j = 0;
        for (int i = max; i >= 1 ; i--) {
            for (; j < n; j++) {
                if(list.get(j).time < i) break;
                pq.offer(list.get(j).money);
            }
            if(!pq.isEmpty()) answer += pq.poll();
        }
    }
}
