package CodingTest_Study.정훈.Brute_Force;

import java.util.Scanner;

public class BF_BJ_1748_수이어쓰기1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        int cnt = 1;
        int num = 10;
        for (int i = 1; i <= n; i++) {
            if(i == num) {
                num *= 10;
                cnt++;
            }
            answer += cnt;
        }
        System.out.println(answer);
    }
}
