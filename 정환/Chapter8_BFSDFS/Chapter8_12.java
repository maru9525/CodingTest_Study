package CodingTest_Study.정환.Chapter8_BFSDFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Chapter8_12 {

    static class point{
        int x;
        int y;
        point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static Queue<point> q = new LinkedList<>();

    static boolean[][] visited;
    static int[][] array;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();
        array = new int[c][r];
        visited =  new boolean[c][r];
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                int temp = sc.nextInt();
                array[i][j] = temp;
                if(temp == 1){
                    q.add(new point(i, j));
                    visited[i][j] = true;
                }
            }
        }
        if(check(array)){
            System.out.println(0);
            return;
        }

        bfs(array);
        if(!check(array)){
            System.out.println(-1);
            return;
        }
        int max = 0;


        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                max = Math.max(array[i][j], max);
            }
        }


        System.out.println(max-1);

    }

    public static void bfs(int[][] array){
        while(!q.isEmpty()){
            point curr = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + curr.x;
                int ny = dy[i] + curr.y;
                if (nx < 0 || ny < 0 || nx > array.length - 1 || ny > array[1].length - 1) continue;
                if (visited[nx][ny]) continue;
                if (array[nx][ny] == 0&&array[nx][ny] != -1) {
                    array[nx][ny] = array[curr.x][curr.y]+1;
                    q.add(new point(nx,ny));
                    visited[nx][ny] = true;
                }
            }
        }
    }

    public static boolean check(int[][] array){
        int n = 0;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                if(array[i][j]==0) n++;
            }
        }
        if(n>0) return false;
        else return true;
    }
}