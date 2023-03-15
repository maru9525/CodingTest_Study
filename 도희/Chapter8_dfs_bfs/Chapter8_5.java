package CodingTest_Study.도희.Chapter8_dfs_bfs;

import java.util.*;

public class Chapter8_5 {
    static int min = Integer.MAX_VALUE;
    static int N,M;
    static Integer[] coin;
    public static void dfs(int x, int total){
        if(total>M) return;
        if(x>=min) return;
        if(total==M){
            min = Math.min(min, x);
        }else{
            for(int i = 0; i< N; i++){
                dfs(x+1, total+coin[i]);
            }
        }

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();
        coin = new Integer[N];
        for(int i = 0; i< N;i++){
            coin[i] = scan.nextInt();
        }
        M = scan.nextInt();
        Arrays.sort(coin, Collections.reverseOrder());
        dfs(0,0);

        System.out.println(min);
    }
}
