package CodingTest_Study.도희.Chapter8_dfs_bfs;
//BFS
import java.util.*;

public class Chapter8_11 {
    static int[][] map;
    static boolean[][] visit;
    static int[][] dist;
    static int dir[][] = {{0,1},{-1,0},{0,-1},{1,0}};
    public static void bfs(int x, int y){
        Queue<Integer> que = new LinkedList<>();

        que.add(x);
        que.add(y);
        visit[x][y] = true;
        dist[x][y] = 0;

        while(!que.isEmpty()){
            x = que.poll();
            y = que.poll();

            for(int i = 0; i<4; i++){
                int nx = x + dir[i][0];
                int ny = y + dir[i][1];
                if(nx < 0 || ny < 0 || nx > 6 || ny > 6) continue;
                if(map[nx][ny] == 1) continue;
                if(visit[nx][ny]) continue;

                que.add(nx);
                que.add(ny);
                visit[nx][ny] = true;
                dist[nx][ny] = dist[x][y] + 1;

            }
        }

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        map = new int[7][7];
        visit = new boolean[7][7];
        dist = new int[7][7];

        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 7; j++){
                map[i][j] = scan.nextInt();
            }
        }
        bfs(0,0);
        if(dist[6][6] == 0 )System.out.println(-1);
        else
            System.out.println(dist[6][6]);

    }
}
