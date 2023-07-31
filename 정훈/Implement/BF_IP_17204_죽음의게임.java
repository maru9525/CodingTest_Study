package CodingTest_Study.정훈.Implement;

import java.util.Scanner;

public class BF_IP_17204_죽음의게임 {
    static int n, k;
    static int[] arr;
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int cnt = 0;
        int idx = 0;
        while(true) {
            ++cnt;
            int val = arr[idx];
            if(val == k) break;
            idx = val;
            if(cnt > n ) break;
        }
        System.out.println(cnt > n ? -1 : cnt);



    }
}
