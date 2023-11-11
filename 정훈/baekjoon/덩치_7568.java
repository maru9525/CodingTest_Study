package CodingTest_Study.정훈.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class 덩치_7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] result = new int[n];
        Arrays.fill(result, 1);
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //몸무게랑 키 둘다 작으면 + 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j ) continue;;
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    result[i]++;
                }
            }
        }
        for(int r : result) System.out.print(r + " ");
    }
}
