package CodingTest_Study.도희.Chapter8_dfs_bfs;

import java.util.*;

public class Chapter8_3 {
    static int N, M;
    static int[] score, time;
    static int max = Integer.MIN_VALUE;
    public static void dfs(int x, int scoreTotal, int timeTotal){
        if(timeTotal>M){
            return;
        }
        if(x==N){
            max = Math.max(scoreTotal,max);
        }else{
            dfs(x+1,scoreTotal+score[x],timeTotal+time[x]);
            dfs(x+1,scoreTotal,timeTotal);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        M = scan.nextInt();

        score = new int[N];
        time = new int[N];
        for(int i = 0;i < N; i++){
            score[i] = scan.nextInt();
            time[i] = scan.nextInt();
        }

        dfs(0,0,0);
        System.out.println(max);
    }
}
