package CodingTest_Study.정환.Chapter8_BFSDFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Chapter8_10 {
    static int result = 0;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] miro = new int[7][7];
        for(int i=0; i<7; i++){
            for(int j=0; j<7; j++){
                miro[i][j] = sc.nextInt();
            }
        }
        boolean[][] check = new boolean[7][7];
        check[0][0] = true;
        dfs(miro, 0, 0, check);
        System.out.println(result);

    }
    static void dfs(int[][] miro, int x, int y, boolean[][] check){
        if(x==6&&y==6){
            result+=1;
        }else{
            for(int i=0; i<4; i++){
                int nx = dx[i]+x;
                int ny = dy[i]+y;
                if(nx<0||ny<0||nx>6||ny>6)continue;
                if(miro[nx][ny]==1)continue;
                if(check[nx][ny])continue;
                check[nx][ny]=true;
                dfs(miro,nx,ny,check);
                check[nx][ny]=false;
            }
        }
    }
}
