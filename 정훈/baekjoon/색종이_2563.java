package CodingTest_Study.정훈.baekjoon;

import java.util.Scanner;

public class 색종이_2563 {
    public static void main(String[] args) {
        //색종이 크기는 100*100
        int[][] map = new int[100][100];
        Scanner sc = new Scanner(System.in);
        int result = 0;
        //색종이 수
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = x; j < x+10; j++) {
                for (int k = y; k < y+10; k++) {
                    map[j][k] = 1;
                }
            }
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if(map[i][j] == 1) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
