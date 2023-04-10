package CodingTest_Study.정훈.Chapter8_DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Chapter8_13 {
    static class Pair{
        int x;
        int y;
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static int n;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {0,0,-1,1,-1,1,-1,1};
    static int[] dy = {-1,1,0,0,-1,-1,1,1};
    static int answer = 0;
    static Queue<Pair> q = new LinkedList<>();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        map = new int[n][n];
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());;
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(map[i][j] == 1 && visited[i][j] == false) {
                    answer++;
                    bfs(i,j);
                }
            }
        }
        System.out.println(answer);

    }

    private static void bfs(int x, int y) {
        q.offer(new Pair(x,y));
        while(!q.isEmpty()){
            Pair p = q.poll();
            int px = p.x;
            int py = p.y;
            for (int d = 0; d < 8; d++) {
                int nx = px + dx[d];
                int ny = py + dy[d];
                if(nx >= 0 && nx < n && ny >= 0 && ny < n && map[nx][ny] == 1 && visited[nx][ny] == false ) {
                    visited[nx][ny] = true;
                    q.offer(new Pair(nx,ny));
                }
            }
        }
    }
}
