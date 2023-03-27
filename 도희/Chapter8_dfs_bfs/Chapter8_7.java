package CodingTest_Study.도희.Chapter8_dfs_bfs;

import java.util.Scanner;

public class Chapter8_7 {
    static int[][] map;
    static boolean[][] visit;
    static int answer;
    static int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
    public static void dfs(int x, int y){
        visit[x][y] = true;
        if(x==6&& y==6){
            answer++;
        }else{
            for(int i = 0; i<4; i++){
                int nx = x+dir[i][0];
                int ny = y+dir[i][1];
                if(nx < 0|| ny<0|| nx>6 || ny>6) continue;
                if(map[nx][ny] == 1) continue;
                if(visit[nx][ny]) continue;
                visit[nx][ny] = true;
                dfs(nx, ny);
                visit[nx][ny] = false;
            }
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        map = new int[7][7];
        visit = new boolean[7][7];

        for(int i = 0; i<7; i++){
            for(int j = 0; j<7; j++){
                map[i][j] = scan.nextInt();
            }
        }
        //(0,0)->(6,6)
        answer = 0;
        dfs(0,0);
        System.out.println(answer);
    }
}
