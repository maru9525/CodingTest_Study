package CodingTest_Study.정훈.Chapter8_DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Chapter8_10 {
    static int[][] map = new int[7][7];
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    static int answer;
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
        dfs(0,0);

        System.out.println(answer);


    }

    private static void dfs(int x, int y) {
        if(x==6 && y==6) answer++;
        else {
            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];
                if(nx>=0 && nx<7 && ny>=0 && ny<7 && map[nx][ny] == 0){
                    map[nx][ny] = 1;
                    dfs(nx,ny);
                    map[nx][ny] = 0;
                }
            }
        }
    }
}
