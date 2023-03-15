package CodingTest_Study.도희.Chapter8_dfs_bfs;

import java.util.*;

public class Chapter8_1 {
    static int N;
    static int[] in;
    static boolean[] visit;
    static boolean[] check;
    static String answer = "NO";
    public static void dfs(int x){
//        if(x==N+1){
//            for(int i = 1; i<=N; i++){
//                if(visit[i] == true) {
//                    System.out.print(in[i]+" ");
//                }
//            }
//            System.out.println();
//        }else{
//            visit[x] = true;
//            dfs(x+1);
//            visit[x] = false;
//            dfs(x+1);
//        }
        //--------------------------------
        if(answer.equals("YES")) return;
        if(x==N+1){
            int total = 0;
            for(int i = 1; i<=N; i++){
                if(visit[i] == true) {
                    System.out.print(in[i]+" ");
                    total += in[i];
                }
            }
            System.out.println();
            System.out.println("total: "+total);
            System.out.println("=============");
            if(check[total]==true){
                System.out.println("!!"+total);
                System.out.println();
                answer = "YES";
            }else{
                check[total] = true;
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
        N = scan.nextInt();
        in = new int[N+1];
        visit = new boolean[N+1];
        int total = 0;
        for(int i = 1; i <= N; i++){
            in[i] = scan.nextInt();
            total += in[i];
        }
        check = new boolean[total+1];
        dfs(1);
        System.out.println(answer);
    }
}
