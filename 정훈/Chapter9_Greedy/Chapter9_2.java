package CodingTest_Study.정훈.Chapter9_Greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Chapter9_2 {
    static class Time implements Comparable<Time> {
        int s;
        int e;
        public Time(int s, int e) {
            this.s = s;
            this.e = e;
        }
        @Override
        public int compareTo(Time t) {
            if(this.e == t.e) return this.s - t.s;
            else return this.e - t.e;
        }

    }
    static int n;
    static int answer = 0;
    static ArrayList<Time> list = new ArrayList<>();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list.add(new Time(start, end));
        }

        Collections.sort(list);
        int endTime = 0;
        for (Time t :
                list) {
            if(t.s >= endTime){
                answer++;
                endTime = t.e;
            }
        }
        System.out.println(answer);
    }
}
