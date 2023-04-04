package CodingTest_Study.정환.Chapter8_BFSDFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Chapter8_11 {
    static class point{
        int x;
        int y;
        int dist;
        point(int x, int y, int dist){
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
    static int result = -1;
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
        bfs(miro);

        System.out.println(result);

    }
    static void bfs(int[][] miro){
        boolean[][] visited = new boolean[7][7];
        Queue<point> q = new LinkedList<>();
        q.add(new point(0,0,0));
        visited[0][0] = true;

        while(!q.isEmpty()){
            point curr = q.poll();
            if(curr.x == 6 && curr.y == 6){
                if(result == -1)result = curr.dist;
                else{
                    result = Math.min(result,curr.dist);
                }
            }
            for(int i=0; i<4; i++){
                int nx = dx[i]+curr.x;
                int ny = dy[i]+curr.y;
                if(nx<0||ny<0||nx>6||ny>6)continue;
                if(visited[nx][ny])continue;
                if(miro[nx][ny]==1)continue;
                q.add(new point(nx,ny, curr.dist+1));
                visited[nx][ny] = true;
            }
        }

    }
}
