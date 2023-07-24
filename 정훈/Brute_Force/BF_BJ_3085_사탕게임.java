package CodingTest_Study.정훈.Brute_Force;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BF_BJ_3085_사탕게임 {
    static int n;
    static char[][] arr;
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                swap(i,j,i,j+1);
                search();
                swap(i,j+1, i,j);
            }
        }

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n; j++) {
                swap(i,j,i+1,j);
                search();
                swap(i+1,j, i,j);
            }
        }
        System.out.println(max);

    }

    private static void search() {
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n - 1; j++) {
                if(arr[i][j] == arr[i][j+1]) {
                    cnt++;
                    max = Math.max(cnt, max);
                }else {
                    cnt = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n - 1; j++) {
                if(arr[j][i] == arr[j+1][i]) {
                    cnt++;
                    max = Math.max(cnt, max);
                }else {
                    cnt = 1;
                }
            }
        }

    }

    private static void swap(int x1, int y1, int x2, int y2) {
        char temp = arr[x1][y1];
        arr[x1][y1] = arr[x2][y2];
        arr[x2][y2] = temp;
    }
}
