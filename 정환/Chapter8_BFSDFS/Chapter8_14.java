package CodingTest_Study.정환.Chapter8_BFSDFS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chapter8_14 {
    //강의봤습니다..
    static class point{
        int x;
        int y;
        point(int x, int y){
            this.x = x;
            this.y =y;
        }
    }

    static List<point> pz, hs;
    static int[] combi;
    static int result = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        pz = new ArrayList<>();
        hs = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) {
                int a = sc.nextInt();
                if(a==1){
                    hs.add(new point(i, j));
                }
                if(a==2){
                    pz.add(new point(i, j));
                }
            }
        }
        combi = new int[m];
        dfs(m, 0, 0, pz.size());

        System.out.println(result);
    }

    static void dfs(int m, int L, int s, int len){
        if(L == m){
            int sum = 0;
            for(point p : hs){
                int dis =  Integer.MAX_VALUE;
                for(int i : combi){
                    dis = Math.min(dis, (Math.abs(p.x-pz.get(i).x) + Math.abs(p.y-pz.get(i).y)));
                }
                sum += dis;
            }
            result = Math.min(sum, result);
        }else{
            for(int i=s; i< len; i++){
                combi[L] = i;
                dfs(m,L+1, i+1, len);
            }
        }
    }

}
