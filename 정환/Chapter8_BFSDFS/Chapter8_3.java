package CodingTest_Study.정환.Chapter8_BFSDFS;

import java.util.Scanner;

public class Chapter8_3 {
    static int result = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] array = new int[n][2];

        for(int i=0; i<n; i++){
            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();
        }
        DFS(array, 0, 0, 0, n, m);
        System.out.println(result);

    }
    public static void DFS(int[][] array, int L, int point, int time, int n, int m){
        if(time > m) return;
        if(L == n){
            result = Math.max(result, point);
        }else{
            DFS(array, L+1, point+array[L][0], time+array[L][1], n, m);
            DFS(array, L+1, point, time, n, m);
        }
    }
}
