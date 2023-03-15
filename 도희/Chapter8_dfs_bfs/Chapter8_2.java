package CodingTest_Study.도희.Chapter8_dfs_bfs;

import java.util.*;

public class Chapter8_2 {
    static int N,C;
    static int[] w;
    static boolean[] visit;
    static int max = Integer.MIN_VALUE;
    public static void dfs(int x){
        if(x == N){
            int total = 0;
            for(int i = 0; i< N; i++){
                if(visit[i]){
                    total += w[i];
                }
            }
            if(total<=C){
                max = Math.max(max, total);
            }
        }else{
            visit[x] = true;
            dfs(x+1);
            visit[x] = false;
            dfs(x+1);
        }

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        C = scan.nextInt();
        N = scan.nextInt();

        w = new int[N];
        for(int i = 0; i< N; i++){
            w[i] = scan.nextInt();
        }
        visit = new boolean[N];
        dfs(0);
        System.out.println(max);
    }
}
