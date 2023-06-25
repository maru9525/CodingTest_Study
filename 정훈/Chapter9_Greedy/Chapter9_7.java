package CodingTest_Study.정훈.Chapter9_Greedy;

import java.util.Scanner;

public class Chapter9_7 {
    static int n;
    static int[] arr;
    static int max = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] LIS = new int[n];
        for (int i = 0; i < n; i++) {
            LIS[i] = 1;
            for (int j = 0; j < i; j++) {
                if(arr[i] > arr[j] ) {
                    LIS[i] = Math.max(LIS[i], LIS[j]+1);
                }
            }

            max = Math.max(max, LIS[i]);
        }
        System.out.println(max);
    }
}
