package CodingTest_Study.정훈.Brute_Force;

import java.util.Scanner;

public class BF_BJ_1476_날짜계산 {
    static int e,s,m; //e:15, s:28, m:19
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        e = sc.nextInt();
        s = sc.nextInt();
        m = sc.nextInt();
        int num = 1;
        while(true) {
            if((num-e)%15 == 0 && (num-s) % 28 == 0 && (num-m) % 19 == 0) {
                break;
            }
            num++;
        }
        System.out.println(num);
    }
}
