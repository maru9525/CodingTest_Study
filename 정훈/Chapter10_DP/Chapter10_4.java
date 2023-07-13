package CodingTest_Study.정훈.Chapter10_DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Chapter10_4 {
    static class Brick implements Comparable<Brick>{
        int id;
        int area;
        int height;
        int weight;

        public Brick(int id, int area, int height, int weight) {
            this.id = id;
            this.area = area;
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Brick o) {
            return this.weight - o.weight;
        }
    }
    static int n;
    static int[] dp;
    static ArrayList<Brick> list;
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        dp = new int[n+1];
        list = new ArrayList<>();
        list.add(new Brick(0,0,0,0));
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int area = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            list.add(new Brick(i+1, area, height, weight));
        }
        Collections.sort(list);

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if(list.get(i).area > list.get(j).area) {
                    dp[i] = Math.max(dp[i], dp[j] + list.get(i).height);
                }
            }
        }

        for (int i = 0; i <= n; i++) {
            if(max < dp[i]) max = dp[i];
        }

        System.out.println(max);

    }
}
