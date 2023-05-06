package CodingTest_Study.정환.Chapter8_BFSDFS;

import java.util.Scanner;

public class Chapter8_13 {
    static int[] dx = {-1,0,1,0,-1,1,-1,1};
    static int[] dy = {0,1,0,-1,-1,1,1,-1};
    static int[][] array;
    static boolean[][] check;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        array = new int[n][n];
        check = new boolean[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++)
                array[i][j] = sc.nextInt();
        }
        int result = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) {
                if(array[i][j] == 1){
                    dfs(i,j,array,check);
                    result++;
                }
            }
        }
        System.out.println(result);


    }

    static void dfs(int i, int j, int[][] array, boolean[][] check){
        check[i][j] = true;
        for(int k=0; k<8; k++){
            int nx = dx[k]+i;
            int ny = dy[k]+j;
            if(nx<0||ny<0 || nx>array.length-1 || ny > array.length-1) continue;
            if(check[nx][ny]) continue;
            if(array[nx][ny] ==0) continue;
            check[nx][ny]=true;
            array[nx][ny] = 0;
            dfs(nx, ny, array, check);
        }
    }
}
