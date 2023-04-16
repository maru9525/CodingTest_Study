package CodingTest_Study.정훈.Chapter9_Greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Chapter9_1 {
    static class Body implements Comparable<Body> {
        int h;
        int w;
        Body(int h, int w) {
            this.h = h;
            this.w = w;
        }
        @Override
        public int compareTo(Body o) {
            return o.h - this.h;
        }
    }
    static int n;
    static int h,w;
    static ArrayList<Body> list = new ArrayList<>();
    static int answer = 0;
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            h = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
            list.add(new Body(h,w));
        }

        Collections.sort(list);
        for(Body b : list) {
            if(b.w > max) {
                max = b.w;
                answer++;
            }
        }
        System.out.println(answer);
    }
}
