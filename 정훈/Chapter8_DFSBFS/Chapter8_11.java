package CodingTest_Study.정훈.Chapter8_DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Chapter8_11 {
    static class Pair{
        int x;
        int y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static int[][] map = new int[7][7];
    static int[][] dis = new int[7][7];
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for (int i = 0; i < 7; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 7; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        map[0][0] = 1;
        bfs(0,0);

        if(dis[6][6] == 0) System.out.println(-1);
        else System.out.println(dis[6][6]);

    }

    private static void bfs(int x, int y) {
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(x,y));

        while(!q.isEmpty()){
            Pair p = q.poll();
            int px = p.x;
            int py = p.y;
            for (int d = 0; d < 4; d++) {
                int nx = px + dx[d];
                int ny = py + dy[d];
                if(nx>=0 && nx<7 && ny>=0 && ny<7 && map[nx][ny] == 0){
                    map[nx][ny] = 1;
                    q.offer(new Pair(nx,ny));
                    dis[nx][ny] = dis[px][py] + 1;
                }
            }
        }
    }
}
