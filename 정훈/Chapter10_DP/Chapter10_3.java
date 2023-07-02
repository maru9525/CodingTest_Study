package CodingTest_Study.정훈.Chapter10_DP;

import java.util.Scanner;

public class Chapter10_3 {
    static int n;
    static int[] LIS;
    static int[] arr;
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        LIS = new int[n];
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            LIS[i] = 1;
            for (int j = 0; j < i; j++) {
                if(arr[i] > arr[j]) {
                    LIS[i] = Math.max(LIS[i] , LIS[j]+1);
                }
            }
            max = Math.max(max, LIS[i]);
        }
        System.out.println(max);


    }
}
